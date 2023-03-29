package com.designpatterns.builder;

public class Customer {
    private String firstName;
    private String lastName;
    private String primaryEmail;
    private String primaryMobileNumber;


    private Customer(CustomerBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.primaryEmail = builder.primaryEmail;
        this.primaryMobileNumber = builder.primaryMobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public String getPrimaryMobileNumber() {
        return primaryMobileNumber;
    }

    @Override
    public String toString() {
        return "Customer{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", primaryEmail='" + primaryEmail + '\'' + ", primaryMobileNumber='" + primaryMobileNumber + '\'' + '}';
    }

    public static class CustomerBuilder {

        private String firstName;
        private String lastName;
        private String primaryEmail;
        private String primaryMobileNumber;


        public CustomerBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public CustomerBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public CustomerBuilder primaryEmail(String primaryEmail) {
            this.primaryEmail = primaryEmail;
            return this;
        }

        public CustomerBuilder primaryMobileNumber(String primaryMobileNumber) {
            this.primaryMobileNumber = primaryMobileNumber;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

    public static void main(String[] args) {
        Customer customer = new CustomerBuilder().firstName("Dipansu").lastName("Barasker").primaryEmail("xyz@abc.com").primaryMobileNumber("1234567890").build();
        System.out.println(customer);
    }
}
