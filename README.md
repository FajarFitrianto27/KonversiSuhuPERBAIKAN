# KonversiSuhuPERBAIKAN
 ## **README - Konversi Suhu dengan Java (JFrame Form)**  

### **📌 Deskripsi Proyek**
Aplikasi **Konversi Suhu** ini dibuat menggunakan **Java** dengan **JFrame Form** di **NetBeans**.  
Pengguna dapat mengonversi suhu antara **Celsius, Fahrenheit, Kelvin, dan Reamur** menggunakan **ComboBox** atau **RadioButton** untuk konversi cepat.

---

### **📌 Fitur Utama**
✅ **Input suhu** melalui `JTextField`.  
✅ **Pilih satuan awal & tujuan** dengan `JComboBox`.  
✅ **Gunakan RadioButton** untuk konversi cepat:  
   - `Celsius → Fahrenheit`  
   - `Fahrenheit → Celsius`  
✅ **Validasi input**, hanya menerima angka.  
✅ **Tampilkan hasil konversi otomatis**.  

---

### **📌 Cara Menggunakan**
1. **Masukkan suhu** pada `JTextField`.  
2. **Pilih satuan asal** di **ComboBox pertama**.  
3. **Pilih satuan tujuan** di **ComboBox kedua**.  
4. Klik **Tombol "Konversi"**, hasil akan muncul.  
5. **Gunakan RadioButton** jika ingin **konversi cepat** _(Celsius ↔ Fahrenheit)_.  

---

### **📌 Struktur Kode Utama**
#### **1. Input Suhu**
- **`txtSuhu`** → Tempat pengguna memasukkan angka suhu.

#### **2. Pemilihan Satuan**
- **`comboBoxSuhu`** → Satuan awal (Celsius, Fahrenheit, Kelvin, Reamur).  
- **`comboBoxTujuan`** → Satuan tujuan (Celsius, Fahrenheit, Kelvin, Reamur).  
- **`jRadioButton1`** → Konversi cepat **Celsius → Fahrenheit**.  
- **`jRadioButton2`** → Konversi cepat **Fahrenheit → Celsius**.  

#### **3. Hasil Konversi**
- **`hasil`** → Menampilkan hasil konversi dengan satuan suhu.

#### **4. Tombol Konversi**
- **`jButton1`** → Tombol untuk menghitung hasil konversi.

---

### **📌 Logika Konversi (Kode Utama)**
```java
public double konversiSuhu(double suhu, String dari, String ke) {
   if (dari.equals("Celsius") && ke.equals("Fahrenheit")) {
        return (suhu * 9 / 5) + 32;
    } else if (dari.equals("Fahrenheit") && ke.equals("Celsius")) {
        return (suhu - 32) * 5 / 9;
    } else if (dari.equals("Celsius") && ke.equals("Reamur")) {
        return suhu * 4 / 5;
    } else if (dari.equals("Reamur") && ke.equals("Celsius")) {
        return suhu * 5 / 4;
    } else if (dari.equals("Celsius") && ke.equals("Kelvin")) {
        return suhu + 273.15;
    } else if (dari.equals("Kelvin") && ke.equals("Celsius")) {
        return suhu - 273.15;
    } else if (dari.equals("Fahrenheit") && ke.equals("Kelvin")) {
        return (suhu - 32) * 5 / 9 + 273.15;
    } else if (dari.equals("Kelvin") && ke.equals("Fahrenheit")) {
        return (suhu - 273.15) * 9 / 5 + 32;
    } else {
        return suhu; // Jika tidak ada konversi yang cocok, kembalikan suhu asli
    }
}
```
**✅ Penjelasan:**  
✅ Fungsi ini menerima **suhu awal**, **satuan asal**, dan **satuan tujuan**.  
✅ Menggunakan **if-else** untuk menentukan **rumus konversi** yang sesuai.  
✅ Jika **satuan asal dan tujuan sama**, maka suhu **tetap sama**.

---

### **📌 Validasi Input (Hanya Angka)**
```java
txtSuhu.addKeyListener(new KeyAdapter() {
    public void keyTyped(KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume(); // Hanya menerima angka dan titik
        }
    }
});
```
**✅ Penjelasan:**  
✅ Mencegah **input selain angka** di `JTextField`.  
✅ Hanya **angka dan titik (.)** yang diperbolehkan.  

---

### **📌 Penggunaan RadioButton untuk Konversi Cepat**
```java
private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    comboBoxSuhu.setSelectedItem("Celsius");
    comboBoxTujuan.setSelectedItem("Fahrenheit");
}                                           

private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    comboBoxSuhu.setSelectedItem("Fahrenheit");
    comboBoxTujuan.setSelectedItem("Celsius");
}   
```
**✅ Penjelasan:**  
✅ Jika **RadioButton 1** ditekan, otomatis mengatur **Celsius → Fahrenheit**.  
✅ Jika **RadioButton 2** ditekan, otomatis mengatur **Fahrenheit → Celsius**.  

---

### **📌 Cara Menjalankan Program**
1. **Buka NetBeans**.  
2. **Buka proyek `KonversiSuhuForm`**.  
3. **Jalankan (`Shift + F6`)**.  
4. **Masukkan suhu, pilih satuan, dan klik "Konversi"**.  
5. **Gunakan RadioButton jika ingin konversi cepat**.  

---

### **📌 Catatan**
✅ **Pastikan NetBeans sudah terinstal**.  
✅ **Gunakan JDK minimal versi 8**.  
✅ **Pastikan semua komponen GUI sudah benar dalam JFrame Form**.  

---

### **📌 Kesimpulan**
🔹 **Aplikasi ini mempermudah pengguna dalam mengonversi suhu antar skala**.  
🔹 **Mendukung konversi antara Celsius, Fahrenheit, Kelvin, dan Reamur**.  
🔹 **Memiliki validasi input dan kemudahan penggunaan melalui GUI**.  

---

🔥 **Selesai!** 🚀  

