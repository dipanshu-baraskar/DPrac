package com.practice;

public class BD {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private BD(BDBuilder bd) {
        this.id = bd.id;
        this.name = bd.name;
    }


    public static class BDBuilder {
        private int id;
        private String name;

        public BDBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public BDBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public BD build() {
            return new BD(this);
        }
    }

    public static void main(String[] args) {
        BD b= new BD.BDBuilder().setId(10).build();
    }
}
