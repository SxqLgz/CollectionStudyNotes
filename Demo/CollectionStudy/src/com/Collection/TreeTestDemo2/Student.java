package com.Collection.TreeTestDemo2;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int ChineseScore;
    private int MathScore;
    private int EnglishScore;
    public Student() {}

    public Student(String name, int age, int chineseScore, int mathScore, int englishScore) {
        this.name = name;
        this.age = age;
        ChineseScore = chineseScore;
        MathScore = mathScore;
        EnglishScore = englishScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ChineseScore=" + ChineseScore +
                ", MathScore=" + MathScore +
                ", EnglishScore=" + EnglishScore +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChineseScore() {
        return ChineseScore;
    }

    public void setChineseScore(int chineseScore) {
        ChineseScore = chineseScore;
    }

    public int getMathScore() {
        return MathScore;
    }

    public void setMathScore(int mathScore) {
        MathScore = mathScore;
    }

    public int getEnglishScore() {
        return EnglishScore;
    }

    public void setEnglishScore(int englishScore) {
        EnglishScore = englishScore;
    }

    @Override
    public int compareTo(Student o) {

        System.out.println("-----------------------");
        System.out.println(this);
        System.out.println(o);
        int i = this.getChineseScore()-o.getChineseScore();
        if(i==0){
            i =  this.getMathScore()-o.getMathScore();
            if (i==0){
                i = this.getEnglishScore()-o.getEnglishScore();
                if (i==0){
                    i = this.getAge()-o.getAge();
                    return i;
                }else {
                    return i;
                }
            }else {
                return i;
            }
        }else {
            return i;
        }
    }
}
