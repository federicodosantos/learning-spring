# Spring
Spring adalah framework yang menyediakan berbagai fitur untuk membangun aplikasi java enterprise.
Sedangkan, Spring boot adalah pengembangan dari Spring framework yang bertujuan untuk menyederhanakan proses konfigurasi  
pada saat awal membuat aplikasi java.

## Inversion of Control (IOC)
Inversion of Control adalah sebuah design pattern yang digunakan untuk mengalihkan tanggung jawab dependensi yang sebelumnya
menginstansiasi objek lalu menjalankan fungsinya. Sedangkan pada IOC, dependensi hanya berfokus pada menjalankan fungsinya saja.
Hal ini karena tugas instansiasi objek merupakan tugas dari IOC container sekarang.

### IOC dan Single Responsibility Principle(SRP)
SRP adalah design principle yang menyatakan bahwa setiap kelas harus memiliki tanggung jawab saja. 
Hubungan IOC dan SRP yaitu IOC membantu pengembang untuk menerapkan SRP dengan memisahkan logika bisnis dan mengatur dependensi.
Dengan IOC, tanggung jawab pembuatan dependensi diambil alih oleh container IoC, sedangkan kelas hanya berfokus pada logika bisnisnya. 

### Spring Inversion of Control
Spring bisa dibilang adalah framework IoC, dimana kita akan menyerahkan banyak sekali pekerjaan dalam program kita ke spring.

## Application Context
ApplicationContext adalah sebuah interface representasi container IoC di Spring.
ApplicationContext merupakan inti dari Spring Framework.

### Configuration 
Untuk membuat ApplicationContext menggunakan Annotation, pertama kita perlu membuat Configuration class.
Configuration Class adalah sebuah class yang terdapat annotation @Configuration pada class tersebut.

## Singleton
Singleton adalah salah satu design pattern untuk pembuatan objek, dimana sebuah objek hanya dibuat satu kali saja.
Dan ketika kita membutuhkan object tersebut, kita hanya akan menggunakan object yang sama.

## Bean
Saat sebuah object kita masukkan kedalam Spring Container IoC, maka kita sebut object tersebut adalah Bean.
Secara default, bean merupakan singleton, artinya jika kita mengakses bean yang sama, maka dia akan mengembalikan object yang sama.
Kita juga bisa mengubahnya jika tidak ingin singleton.

## Duplicate Bean
Di Spring, kita bisa mendaftarkan beberapa bean dengan tipe yang sama.
Namun perlu diperhatikan, jika kita membuat bean dengan tipe data yang sama, maka kita harus menggunakan nama bean yang berbeda.
Selain itu, saat kita mengakses bean nya, kita wajib menyebutkan nama bean nya, karena jika tidak, Spring akan bingung harus mengakses bean yang mana.

## Primary Bean
Jika terjadi duplicate bean, selain kita sebutkan nama beannya ketika ingin mengakses beannya, 
kita juga bisa pilih salah satu bean menjadi primary. 
Dengan memilih salah satunya menjadi primary, secara otomatis jika kita mengakses bean tanpa menyebutkan nama beannya, secara otomatis primary nya yang akan dipilih.

## Dependency Injection
Dependecy Injection adalah teknik dimana kita bisa mengotomatisasi proses pembuatan object yang tergantung dengan object lain.
atau kita sebut dependecies.
Dependecies akan secara otomatis di-inject kedalam object yang membutuhkannya.

### Spring Dependency Injection
Ketika kita membuat method untuk bean di Spring, kita bisa menambahkan paramter.
Secara otomatis Spring akan mencarikan bean lain yang sesuai dengan tipe paramter tersebut. 
Jika ternyata tidak ada bean yang cocok, maka secara otomatis akan terjadi error. Dan jika ternyata terdapat bean lebih dari satu,
secara otomatis akan terjadi error, kecuali terdapat primary bean.

## Circular Dependencies
Circular dependencies adalah kasus dimana sebuah lingkaran dependency terjadi, misal bean A membutuhkan bean B membutuhkan bean C
dan ternyata bean C membutuhkan Bean A. Jika terjadi cyclic seperti ini, secara otomatis Spring bisa mendeteksinya dan akan menganggap bahwa itu adalah error

## Depends On
Depends On digunakan jika ada kasus kita ingin sebuah bean dibuat setelah bean lain dibuat. Kita bisa menggunakan annotation @DependsOn
Secara otomatis, Spring akan memprioritaskan pembuatan bean yang terdapat di DependsOn terlebih dahulu.

## Lazy Bean
Secara default, bean di Spring akan dibuat ketika aplikasi Spring pertama kali berjalan.
Oleh karena itu, kadang ketika aplikasi Spring pertama berjalan akan sedikit lambat, hal ini dikarenakan semua bean akan dibuat di awal.
Namun, kita bisa membuat bean dimana bean tidak akan dibuat hingga dibutuhkan.
Hal itu dinamakan sebagai lazy bean. Untuk membuat lazy bean, kita bisa menambahkan annotation @Lazy pada bean tersebut.

## Scope
Scope merupakan strategi cara sebuah object dibuat. Secara deault strategi objek di Spring adalah singleton, 
artinya hanya dibuat sekali dan ketika kita akses akan mengembalikan object yang sama.
Namun kita juga bisa mengubaha scope bean yang kita mau di Spring. Untuk mengubah scop sebuah bean, kita bisa tambahakan annotation @Scope.