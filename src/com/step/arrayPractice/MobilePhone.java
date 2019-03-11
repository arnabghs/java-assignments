package com.step.arrayPractice;

import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
  private static Scanner scanner = new Scanner(System.in);
  private static ArrayList<Contact> contactList = new ArrayList<Contact>();
  private static boolean hasQuit = false;
  private static String endLine = "\n...............\n";

  public static void main(String[] args) {
    executeSingleCycle();
  }

  private static void executeSingleCycle() {
    showMenu();
    if (scanner.hasNextInt()) {
      int option = scanner.nextInt();
      processInput(option);
    } else {
      System.out.println("Invalid Input" + endLine);
      scanner.nextLine();
    }
    if (!hasQuit) {
      executeSingleCycle();
    }
    scanner.close();
  }

  private static void processInput(int option) {
    switch (option) {
      case 1:
        addContact();
        break;
      case 2:
        updateContact();
        break;
      case 3:
        removeContact();
        break;
      case 4:
        printContacts();
        break;
      case 5:
        searchContact();
        break;
      case 6:
        quit();
        break;
      default:
        System.out.println("Not a valid option");
    }
  }

  private static void removeContact() {

    System.out.println("Enter name: ");
    scanner.nextLine();
    String name = scanner.nextLine();

    for (Contact contact : contactList) {
      if (contact.getName().equals(name)) {
        contactList.remove(contact);
        System.out.println("contact is removed" + endLine);
        return;
      }
    }
  }

  private static void printContacts() {
    for (int i = 0; i < contactList.size(); i++) {
      System.out.println((i + 1) + ". " + contactList.get(i).getName() + " -> " + contactList.get(i).getNumber());
    }
    System.out.println(endLine);
  }

  private static void quit() {
    hasQuit = true;
    System.out.println("Operation succuessfully ended." + endLine);
  }

  private static void searchContact() {
    System.out.println("Enter name: ");
    scanner.nextLine();
    String name = scanner.nextLine();

    for (Contact contact : contactList) {
      if (contact.getName().equals(name)) {
        System.out.println("You searched for: " + contact.getName() + " -> " + contact.getNumber());
        return;
      }
    }
    System.out.println("Contact was not found.");
    System.out.println(endLine);
  }

  private static void updateContact() {
    scanner.nextLine();
    System.out.println("Enter contact name you want to modify: ");
    String name = scanner.nextLine();

    for (Contact contact : contactList) {
      if (contact.getName().equals(name)) {
        int index = contactList.indexOf(contact);
        Contact newContact = createContact();
        contactList.set(index, newContact);
        System.out.println("Contact modified." + endLine);
        return;
      }
    }
    System.out.println("Sorry, no matching name found." + endLine);
  }

  private static void addContact() {
    Contact newContact = createContact();
    contactList.add(newContact);
    System.out.println("New contact added." + endLine);
  }

  private static void showMenu() {
    String optionList = "Enter option number:\n" +
            "1. Add new contact\n" +
            "2. Update existing contact\n" +
            "3. Remove Contact\n" +
            "4. Print List of Contact\n" +
            "5. Search Contact\n" +
            "6. Quit\n";
    System.out.println(optionList);
  }

  private static Contact createContact() {
    scanner.nextLine();
    System.out.println("Enter new name: ");
    String newName = scanner.nextLine();

    System.out.println("Enter new number: ");
    int number = scanner.nextInt();

    return new Contact(newName, number);
  }
}