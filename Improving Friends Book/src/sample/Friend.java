package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Friend {
        private String age;
        public String phoneNumber;
        public String name;

        //friend constructor
        Friend (String name, String age, String phoneNumber){
            this.age = age;
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        //getters and setters
        public String getAge() {
            return age;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }
        public String toString(){
            return "Name: " + name + " Phone #: " + phoneNumber;
        }

        public void writeToFile() throws IOException {
            FileWriter fw = new FileWriter ("friends.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(name + ",\r");
            bw.write(age +",\r");
            bw.write(phoneNumber +"\r");
            bw.write(";\r");
            bw.close();
        }
        public boolean compareFriends (Friend x){
            if (this.name.equals(x.name)){
                return true;
            }
            else return false;
        }

}
