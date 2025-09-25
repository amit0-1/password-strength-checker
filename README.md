
# 🔐 Password Strength Checker – Java Project  

## 📌 Overview  
This project is part of my **Java Development Internship (Level 2 – Task 2)** with **Cognifyz Technologies**.  
It demonstrates a simple **Password Strength Checker** that evaluates how strong a password is based on:  
- Length  
- Uppercase letters  
- Lowercase letters  
- Numbers  
- Special characters  

---

## 🛠️ Features  
✔️ Analyze password strength: **Empty, Weak, Moderate, Strong, Very Strong**  
✔️ Check for character variety (uppercase, lowercase, digits, special symbols)  
✔️ Give **feedback & suggestions** to improve password strength  
✔️ Simple console-based interaction  

---

## 📂 Project Structure  
```
PasswordStrengthChecker.java   # Main source code
README.md                      # Project documentation
```

---

## ⚡ How It Works  
1. User inputs a password.  
2. Program analyzes:  
   - Length of the password  
   - Presence of uppercase, lowercase, digits, and special characters  
3. Assigns a **score** and categorizes the password as:  
   - Empty  
   - Weak  
   - Moderate  
   - Strong  
   - Very Strong  
4. Provides **feedback & recommendations** for stronger security.  

---

## 💻 Example Run  
```
Enter a password to check: MyPass123!

Strength: Strong
Details:
- Length: 9
- Contains uppercase: true
- Contains lowercase: true
- Contains digit: true
- Contains special: true

Feedback:
- Consider using 12+ characters for better security.
```

---

## 📊 Skills Practiced  
- String Manipulation  
- Character Analysis (`Character.isUpperCase()`, `Character.isLowerCase()`, etc.)  
- Conditional Statements  
- Input Handling with Scanner  

---

## 🚀 How to Run  
1. Clone the repository:  
   ```bash
   git clone https://github.com/your-username/PasswordStrengthChecker.git
   cd PasswordStrengthChecker
   ```
2. Compile the program:  
   ```bash
   javac PasswordStrengthChecker.java
   ```
3. Run the program:  
   ```bash
   java PasswordStrengthChecker
   ```
