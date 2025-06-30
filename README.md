# 🏥 Hospital Management System in Java

This is a simple console-based Hospital Management System implemented in **Java** using core Object-Oriented Programming (OOP) concepts like:

- Classes & Objects
- Inheritance
- Interfaces
- Polymorphism
- Inner Classes
- Constructor usage
- User input with `Scanner`

---

## 📌 Features

- Accepts patient details (name, age, phone number)
- Welcomes the user via Reception class
- Registers patient in a queue
- Asks for the type of issue (`normal` / `dejective`)
- Uses **interface + polymorphism** to call the appropriate treatment class
- Generates a simple bill (based on name length as mock logic)

---

## 🧠 OOP Concepts Demonstrated

| Concept        | Implementation                 |
|----------------|--------------------------------|
| Inheritance     | `patient_details` extends `Reception` |
| Interface       | `doctors_details` for doctor behavior |
| Polymorphism    | `doctors_details dc = new Normal()` |
| Constructor     | To initialize patient info    |
| Encapsulation   | Using class variables         |
| Inner Classes   | For organizing components logically |

---

## 💻 Technologies Used

- Java (JDK 17+)
- Console I/O (`Scanner`)

---

## 🧪 Sample Run

```plaintext
Enter Your Name
Mano
Enter Your age
22
Enter your phone number
9876543210
Greetings.This is a LSK EMERGENCY CARE
Hello Sir You are Welcome
Kindly Enter your name please
Check out the details you have shared
Name: Mano
Age: 22
PhoneNumber: 9876543210
You are registered; Please be wait for sometime
What is the issue? (normal/dejective)
normal
Take Care 
Prescribe: basic tablets and rest
Generating bill...
4
