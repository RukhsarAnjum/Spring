package com.training.greeterwithannotationbean;


    public interface Visitor {
        /** Visitor's name */
        public String getName();
        /** Hello, Howdy, Hiya, etc. */
        public String getGreeting();
    }

