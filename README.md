# 🚗 Vehicle Parking Management System

![Java](https://img.shields.io/badge/Java-17-orange)
![OOP](https://img.shields.io/badge/OOP-Concepts-blue)
![Status](https://img.shields.io/badge/Project-Completed-green)

A console-based **Vehicle Parking Management System** developed using **Java** and **Object-Oriented Programming (OOP)** principles. The application helps manage vehicle parking operations efficiently by automatically allocating parking slots, tracking vehicle entries and exits, calculating parking fees, and monitoring parking slot availability.

---

# 📖 Overview

This project simulates a real-world parking management system where users can:

- Park vehicles
- Search parked vehicles
- View all parked vehicles
- Monitor parking slot availability
- Remove vehicles from parking
- Automatically assign parking blocks and slots
- Calculate parking fees based on vehicle type
- Exit the application safely

The system records the entry time of every vehicle, assigns the first available parking slot automatically, and calculates parking charges during vehicle checkout.

---

# ✨ Features

## 🚘 Park Vehicle

- Add a new vehicle to the parking lot.
- Store:
  - Vehicle Number
  - Owner Name
  - Vehicle Type
  - Entry Time
- Automatically assigns:
  - Parking Block (A–D)
  - Slot Number (1–25)

---

## 🚫 Duplicate Vehicle Detection

- Prevents the same vehicle from being parked more than once.
- Displays an appropriate message if the vehicle is already parked.

---

## 📋 Display All Vehicles

- View details of all parked vehicles.
- Shows:
  - Vehicle Number
  - Owner Name
  - Vehicle Type
  - Parking Location (Block & Slot)
  - Entry Time

---

## 🔍 Search Vehicle

- Search any parked vehicle using its vehicle number.
- Displays:
  - Vehicle Number
  - Owner Name
  - Vehicle Type
  - Parking Location

---

## 🅿️ Slot Management

Displays:

- Total Parking Slots
- Occupied Slots
- Available Slots

---

## ⏱️ Entry & Exit Tracking

- Automatically records entry time.
- Generates exit time during checkout.

---

## 💰 Parking Fee Calculation

Parking charges are calculated automatically based on:

- Parking duration
- Vehicle type

| Vehicle Type | Charge Per Hour |
|--------------|-----------------|
| 🚲 Bike           | ₹10 |
| 🚗 Car            | ₹20 |
| 🚚 Truck          | ₹40 |

> Minimum parking fee is charged for **1 hour**.

---

## 🚪 Vehicle Checkout

During checkout, the system:

- Displays complete vehicle details
- Displays parking location
- Shows entry & exit time
- Calculates parking fee
- Frees the occupied parking slot
- Removes the vehicle from the parking lot

---

# 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Arrays
- Scanner Class
- LocalDateTime API
- Duration API

---

# 📂 Project Structure

```text
Parking-Management-System
│
├── Main.java
├── ParkingManager.java
├── Vehicle.java
└── README.md
```

---

# 🧠 OOP Concepts Used

### Encapsulation

Vehicle information is stored using private variables and accessed through getter methods.

### Classes & Objects

- Vehicle Class
- ParkingManager Class
- Main Class

### Abstraction

Parking operations such as parking, searching, displaying, and removing vehicles are managed through dedicated methods.

### Modularity

The project is divided into separate Java classes, making the code organized, reusable, and easier to maintain.

---

# 📸 Project Screenshots

## 🏠 Main Menu

![Main Menu](<img width="696" height="455" alt="Main Menu" src="https://github.com/user-attachments/assets/84fcc8bd-acbb-4d6f-9b8a-bea74de3b855" />)

---

## 🚘 Park Vehicle

![Park Vehicle](<img width="713" height="551" alt="Park Vehicle" src="https://github.com/user-attachments/assets/c4f03910-38af-4df6-9b45-17863520ec1a" />)

---

## 📋 Display Vehicles

![Display Vehicles](<img width="719" height="547" alt="Display Vehicle" src="https://github.com/user-attachments/assets/8e0817e3-44a2-48f9-a0b4-460dc9999ac3" />)

---

## 🔍 Search Vehicle

![Search Vehicle](<img width="803" height="610" alt="Search Vehicle" src="https://github.com/user-attachments/assets/76024147-264f-4516-abad-81a8e6eafdb4" />)

---

## 🅿️ Slot Status

![Slot Status](<img width="741" height="522" alt="Slot Status" src="https://github.com/user-attachments/assets/99e02f81-d80d-4394-871e-66ced6d865c8" />)

---

## 💰 Vehicle Checkout & Fee Calculation

![Vehicle Checkout](<img width="759" height="533" alt="Vehicle Checkout" src="https://github.com/user-attachments/assets/4a22de6a-eb62-43f8-9927-224b04dc3d92" />)

---

# ▶️ How to Run

### Clone Repository

```bash
https://github.com/Ashleshagaikwad062/Parking-Management-System.git
```

### Open in IntelliJ IDEA

1. Open IntelliJ IDEA
2. Select **Open**
3. Choose the **Parking-Management-System** project folder.

### Run

Run:

```text
Main.java
```

---

# 📊 Sample Menu

```text
=========================================
     VEHICLE PARKING MANAGEMENT SYSTEM
=========================================

1. Park Vehicle
2. Remove Vehicle
3. Search Vehicle
4. Display All Vehicles
5. Display Slot Status
6. Exit

Enter Your Choice:
```

---

# 📈 Future Enhancements

- Java Swing GUI
- JavaFX Dashboard
- MySQL Database Integration
- Admin Login System
- Vehicle History Tracking
- Monthly Parking Pass System
- QR Code Based Entry/Exit
- Online Parking Reservation
- Report Generation

---

# 👨‍💻 Developer

### Ashlesha Gaikwad

Diploma in Computer Engineering

Aspiring Software Engineer | Java Developer

---
