package SimplePrograms;

import java.io.*;
class Parent
{
  void msg()throws Exception
  {
	  System.out.println("parent");
	  }
}

class TestExceptionChild5 extends Parent
{
  void msg()
  {
	  System.out.println(5/0);
	  }

  public static void main(String args[]){
   Parent p=new TestExceptionChild5();
   try{
   p.msg();
   }catch(Exception e){}
  }
}
