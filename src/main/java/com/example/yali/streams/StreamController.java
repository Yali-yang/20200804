package com.example.yali.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yali
 * @date 2020-06-21 20:39:48
 * @description
 **/
public class StreamController {

    public static void main(String[] args) {
        test3();
    }

    public static void test3(){
        List<Employee> list = getEmployees();
        long count = list.stream().count();
        System.out.println(count);
    }

    public static void test2(){
        //4.map:把list中的元素替换成大写的
        List<String> strings = Arrays.asList("aa", "bb", "cc");
        strings.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
        //5.获取员工姓名长度大于3的姓名
        List<Employee> list = getEmployees();
        list.stream().map(Employee::getName).filter(s -> s.length()>3).forEach(System.out::println);
        //6.flatMap():这个方法会把stream打散作为一个一个的stream
    }

    public static void test1() {
        List<Employee> list = getEmployees();
        //1.过滤操作：过滤工资大于7000的
        //Stream<T> filter(Predicate<? super T> predicate);
        list.stream().filter(s -> s.getSalary() > 7000.00).forEach(System.out::println);
        //2.截断流：截取list中前3条数据
        list.stream().limit(3).forEach(System.out::println);
        //3.skin(3)：跳过前3个元素
        list.stream().skip(3).forEach(System.out::println);
        ///4.distinct():去重，根据hashcode()和equals()
        list.stream().distinct().forEach(System.out::println);


    }

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1001, "马化腾", 34, 6000.38));
        employees.add(new Employee(1002, "马云", 12, 9876.12));
        employees.add(new Employee(1003, "刘强东", 33, 3000.82));
        employees.add(new Employee(1004, "雷军", 26, 7657.37));
        employees.add(new Employee(1005, "李宏彦", 65, 5555.32));
        employees.add(new Employee(1006, "比尔盖茨", 42, 9500.43));
        employees.add(new Employee(1007, "任正非", 26, 4333.32));
        employees.add(new Employee(1008, "扎克伯格", 35, 2500.32));
        return employees;
    }
}
