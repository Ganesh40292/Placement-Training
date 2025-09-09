package com;

public class Program3 {

  public static void main(String[] args) {

    System.out.println("Program Starts");

    String name="Dinga";

    try

    {

      System.out.println(name.charAt(6));

    }

    catch(StringIndexOutOfBoundsException e)

    {

      System.out.println("Trying to access the invalid index");

    }

    System.out.println("Program Ends");

  }

}
