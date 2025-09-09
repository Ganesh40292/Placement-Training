package com;

public class Program5 {

  public static void main(String[] args) {

    int a=10;

    int b=0;

    try

    {

      System.out.println(a/b);

    }

    catch(ArrayIndexOutOfBoundsException e)

    {

      e.printStackTrace();

    }

    catch(StringIndexOutOfBoundsException e)

    {

      e.printStackTrace();

    }

    catch(NullPointerException e)

    {

      e.printStackTrace();

    }

    catch(Exception e)

    {

      e.printStackTrace();

    }

    System.out.println("Program Ends");

  }

}

