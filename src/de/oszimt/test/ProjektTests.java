package de.oszimt.test;

public class ProjektTests {
   public static void main(String[] args) {
      junit.textui.TestRunner.run(KontoTest.class);
      junit.textui.TestRunner.run(BankTest.class);
      junit.textui.TestRunner.run(KundeTest.class);
   }
}
