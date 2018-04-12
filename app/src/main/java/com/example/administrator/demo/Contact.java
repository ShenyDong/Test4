package com.example.administrator.demo;

/**
 * Created by apple on 2018/4/12.
 */
public class Contact {
        //姓名
        private String name;
        //姓名的首字母
        private String number;
        private String firstWord;

    public Contact(String userName, String phoneNumber) {
        this.name=userName;
        this.number=phoneNumber;
    }


    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFirstWord() {
            return firstWord;
        }

        public void setFirstWord(String ch) {
            this.firstWord = ch;
        }
    }

