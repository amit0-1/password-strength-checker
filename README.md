
# 🔐 File Encryption/Decryption – Java Project  

## 📌 Overview  
This project is part of my **Java Development Internship (Level 2 – Task 3)** with **Cognifyz Technologies**.  
It demonstrates a simple **file encryption and decryption system** using the **Caesar Cipher algorithm**.  

Users can:  
- Encrypt a text file  
- Decrypt the encrypted file back to original  
- Save results to a new file  

---

## 🛠️ Features  
✔️ Encrypt text files 🔒  
✔️ Decrypt back to original 🔓  
✔️ Simple Caesar Cipher algorithm (shift = 3)  
✔️ File handling with Java I/O  
✔️ Error handling for invalid inputs  

---

## 📂 Project Structure  
```
FileEncryptionDecryption.java   # Main source code
README.md                       # Project documentation
input.txt                       # Example input file
output.txt                      # Example encrypted/decrypted output
```

---

## ⚡ How It Works  
1. User provides **input file path**  
2. Chooses operation: `encrypt` or `decrypt`  
3. Program applies Caesar Cipher logic:  
   - **Encryption** → shifts each character by +3  
   - **Decryption** → shifts each character by -3  
4. Saves result in a new file  

---

## 💻 Example Run  
```
=== File Encryption/Decryption ===
Enter file path: input.txt
Enter output file path: output.txt
Choose operation (encrypt/decrypt): encrypt
File encrypted successfully!
Output saved to: output.txt
```

---

## 📊 Skills Practiced  
- File Handling (`BufferedReader`, `BufferedWriter`)  
- String Manipulation  
- Basic Input/Output Operations  
- Encryption & Decryption Logic  

---

## 🚀 How to Run  
1. Clone the repository:  
   ```bash
   git clone https://github.com/your-username/FileEncryptionDecryption.git
   cd FileEncryptionDecryption
   ```
2. Compile the program:  
   ```bash
   javac FileEncryptionDecryption.java
   ```
3. Run the program:  
   ```bash
   java FileEncryptionDecryption
   ```

## 📌 Example Files  
- `input.txt` → contains original text  
- `output.txt` → will contain encrypted/decrypted text  

---
