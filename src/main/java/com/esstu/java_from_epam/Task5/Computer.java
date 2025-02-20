package com.esstu.java_from_epam.Task5;

public class Computer {


    public Computer(){
    }

    public static class SystemSpecs {
        private String os;
        private String processor;
        private int ram;

        SystemSpecs(String os, String processor, int ram) {
            this.os = os;
            this.processor = processor;
            this.ram = ram;
        }

        public String getOs() {
            return os;
        }
        
        public void setOs(String os){
            this.os = os;
        }

        public String getProcessor() {
            return this.processor;
        }

        public void setProcessor(String processor){
            this.processor = processor;
        }
        
        public int getRam() {
            return this.ram;
        }

        public void setRam(int ram){
            this.ram = ram;
        }

        @Override
        public String toString() {
            return "Ситемные характеристки {" + "ОС:" + this.os + ", Процессор:" + this.processor  + ", ОЗУ:" + this.ram + '}';
        }
    }
}
