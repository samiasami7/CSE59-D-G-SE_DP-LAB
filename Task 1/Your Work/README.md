# Your SRS
# Software Requirements Specification (SRS)

## Project Title: Advanced Temperature Converter System

---

# Preface

This document provides the Software Requirements Specification (SRS) for the **Advanced Temperature Converter System**, a desktop-based Java Swing application. The system allows users to convert temperatures between Celsius, Fahrenheit, and Kelvin, while providing health suggestions, temperature alerts, and a personalized user experience.

---

# Version History

* **Version 1.0** – Initial Draft
* **Version 1.1** – Added functional and non-functional requirements
* **Version 1.2** – Added system models, features, and libraries

---

# 1. Introduction

## Purpose

The **Advanced Temperature Converter System** is designed to:

* Convert temperature values between Celsius, Fahrenheit, and Kelvin.
* Display health-related insights and advice based on temperature readings.
* Provide a user-friendly GUI for easy interaction.
* Capture user details (name, age, gender) for a personalized experience.

This application is intended for students, educators, or casual users who want quick and informative temperature conversions.

---

## Document Conventions

* **Must** – Mandatory requirement
* **Should** – Recommended requirement
* **May** – Optional enhancement

---

## Intended Audience and Reading Suggestions

* **Developers** – Implementation and debugging guidance
* **Project Supervisors / Evaluators** – Understanding project features and evaluation
* **Testers / QA Teams** – Validation of functional and non-functional requirements
* **End Users** – Understanding system usage

---

## Scope

The system provides:

* Temperature conversion between Celsius, Fahrenheit, and Kelvin.
* Real-time conversion with immediate display of results.
* Health condition classification (Normal, Mild Fever, High Fever, Low Temperature).
* User profile details (name, age, gender) for personalized output.
* Optional advanced suggestions and temperature alerts.
* Graphical interface using Java Swing with customized background and layout.

---

## References

* Java SE Documentation
* Java Swing GUI Library
* Oracle Java Tutorials
* IEEE Standard 830-1998 (SRS Documentation)

---

# 2. Overall Description

## Product Perspective

* Standalone desktop application developed in **Java** using **Swing**.
* No internet connection required.
* Provides interactive GUI for user-friendly temperature conversion.
* Customizable background image and color-coded UI elements for enhanced visual appeal.

---

## Product Functions

1. **User Input**

   * Capture Name, Age, and Gender.
   * Enter temperature value to be converted.
   * Select source and target temperature units.

2. **Temperature Conversion**

   * Convert between Celsius, Fahrenheit, and Kelvin.
   * Perform accurate arithmetic conversions using standard formulas.

3. **Health Assessment**

   * Classify temperature readings into Low, Normal, Mild Fever, or High Fever.
   * Provide health suggestions for abnormal temperatures.

4. **Advanced Features**

   * Optional suggestions from a “Doctor Advice” panel.
   * Temperature alert panel with detailed high/low temperature risks.

5. **User Interaction**

   * Clear input and reset fields.
   * Checkbox to confirm thermometer reading.
   * Real-time display of conversion results with timestamp.

---

## User Classes and Characteristics

* **User** – General user with basic computer literacy.
* **Optional Users** – Medical students or educators who may use advice features.

---

## Operating Environment

* **Programming Language:** Java SE 8 or higher
* **GUI Library:** Java Swing
* **Operating Systems:** Windows, Linux, macOS
* **IDE Support:** NetBeans, Eclipse, IntelliJ IDEA
* **JRE Requirement:** Installed and properly configured
* **Background Image:** `img/pink.jpg` (optional)

---

## Design and Implementation Constraints

* Must use **Java Swing** for GUI.
* Should maintain accuracy for all conversions.
* Must be executable without internet connectivity.
* Must validate input to avoid crashes or invalid calculations.

---

## Assumptions and Dependencies

* User has Java installed.
* User inputs numeric values for temperature.
* Background image file is available in project directory.

---

# 3. System Requirements Specification

## Functional Requirements

### User Interface

* Text fields for Name, Age, Temperature input.
* Combo boxes for Gender, Source Unit, and Target Unit.
* Buttons: Convert, Clear, and optional panels.
* Checkboxes for thermometer confirmation and additional suggestions.

### Temperature Conversion Logic

* Celsius ↔ Fahrenheit
* Celsius ↔ Kelvin
* Fahrenheit ↔ Kelvin

### Input Validation

* Must validate numeric input for temperature.
* Must show warnings for empty or invalid input.
* Must require thermometer confirmation before conversion.

### Output

* Display converted temperature with units.
* Show timestamp of conversion.
* Display user info (Name, Age, Gender).
* Classify health condition.
* Show optional doctor suggestions and temperature alerts.

### Additional Features

* Doctor Suggestions Panel – Detailed advice based on health conditions.
* Temperature Variations Panel – High/Low temperature risks with detailed info.

---

## Non-Functional Requirements

### Performance

* Immediate conversion upon pressing Convert.
* Lightweight execution, minimal system resource usage.

### Security

* No sensitive data storage.
* User details are local and temporary (not saved).

### Usability

* User-friendly GUI with clear labels and buttons.
* Background color and image for aesthetics.
* Simple error messages and guidance prompts.

### Reliability & Availability

* Accurate temperature conversion.
* Application must not crash during normal usage.

### Maintainability

* Modular code using methods (e.g., `getHealthCondition`).
* Easy to modify for additional temperature scales or features.

### Portability

* Runs on Windows, Linux, and macOS with JRE installed.

---

# 4. System Models

### Context Diagram

```
User → Inputs: Name, Age, Gender, Temperature, Unit Selection → System → Outputs: Converted Temperature, Health Condition, Timestamp, Suggestions
```

### Activity Diagram

1. Start Application
2. Enter User Details and Temperature
3. Select Units and Confirm Thermometer
4. Press Convert → Display Results
5. Optionally, Check Doctor Suggestions or Temperature Variations
6. Press Clear to Reset Fields

### Use Case Diagram

* **Actors:** User
* **Use Cases:** Input Data, Convert Temperature, View Result, Clear Fields, View Suggestions

### Sequence Diagram

1. User enters details and temperature.
2. User selects source and target units.
3. User confirms thermometer check.
4. System validates input.
5. System calculates conversion.
6. System updates display with result and health info.
7. Optional: User selects suggestions or temperature variations → system displays advice.

### State Diagram

* Idle → Input → Processing → Display Result → Idle/Reset

---

# 5. System Evolution

### Assumptions

* Future versions may support more temperature scales (e.g., Rankine).
* Mobile app version may be developed.
* Voice-based input and AI-based health advice may be integrated.

### Expected Changes

* Improve UI and add themes.
* Add history tracking of conversions.
* Add data export (PDF/CSV) for temperature records.

---

# 6. Appendices

### Libraries Used

* `javax.swing.*` – GUI components
* `java.awt.*` – Graphics, color, font management
* `java.awt.event.*` – Event handling
* `java.time.*` – Date and time management
* `javax.swing.JOptionPane` – Message dialogs
* `java.lang.*` – Core Java functionality

### Hardware Requirements

* Minimum 2 GB RAM
* Dual-Core Processor
* 100 MB Free Storage

### Software Requirements

* Java SE 8 or higher
* JDK + IDE (NetBeans/Eclipse/IntelliJ)

### Database Requirements

* Not applicable – no database used

---
