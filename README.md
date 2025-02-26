# praktikum-pbo-m5

## Praktikum PBO M5

### Materi

Buatlah game Harvest Moon sederhana Pada game ini akan terdapat 4 jenis tanaman. Berikut rincian dari tanaman-tanaman tersebut :

| Nama    | Waktu utk siap panen | Harga jual | Harga bibit |
| ------- | -------------------- | ---------- | ----------- |
| Anggrek | 6 Hari               | 500C       | 800C        |
| Tulip   | 5 Hari               | 400C       | 300C        |
| Lily    | 4 Hari               | 300C       | 200C        |
| Mawar   | 4 Hari               | 250C       | 200C        |

Catatan : untuk waktu siap panen dapat bertambah tergantung dari rutin atau tidaknya player menyiram tanaman setiap hari. Bila tidak disiram maka tidak akan masuk perhitungan tersebut.

Keempat tanaman di atas mempunyai ciri khasnya masing-masing. Ciri khas ini akan muncul setiap kali tanaman berubah dari bibit menjadi tanaman siap panen. Berikut rinciannya :

| Nama    | Bentuk                                                                | Keterangan                                                                                          |
| ------- | --------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| Anggrek | \| \|A\| \| <br> \| \|A\| \| <br> \| \|&nbsp; \| \|                   | Yang didrop adalah tanaman yang siap panen, bukan bibit. Arahnya random (atas, bawah, kanan, kiri). |
| Tulip   | \|t\|&nbsp; \|t\| <br> \| \|T\| \| <br> \|t\|&nbsp; \|t\|             | Yang didrop adalah bibitnya.                                                                        |
| Lily    | \| \|&nbsp; \| \| <br> \|l\|L\|l\| <br> \| \|&nbsp; \| \|             | Yang didrop adalah bibitnya.                                                                        |
| Mawar   | \|&ensp; \|m\|&ensp; \| <br> \|m\|M\|m\| <br> \|&ensp; \|m\|&ensp; \| | Yang didrop adalah bibitnya.                                                                        |

Pada game ini juga terdapat pupuk yang berguna untuk mempercepat waktu pertumbuhan tanaman. Berikut rinciannya :

| Nama          | Harga | Pengurangan waktu |
| ------------- | ----- | ----------------- |
| Pupuk kompos  | 75C   | 3 hari            |
| Pupuk kandang | 50C   | 2 hari            |
| Pupuk kimia   | 20C   | 1 hari            |

Permainan\
Berikut tampilan awal dari permainan :

```
 ~~ Harvest Moon ~~
DAY : 1
Coins : 1000C
---------------------
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
---------------------
1. Tanam bibit
2. Beri pupuk
3. Shop
4. Panen
5. Jual hasil panen
6. Siram tanaman
7. Ganti hari
8. Lihat list tanaman pada kebun
0. Quit
>>
```

Pada game ini, akan terdapat sebuah kebun dengan ukuran 10\*10 (tidak termasuk border). Tampilkan sekarang hari ke berapa dan jumlah coin yang dimiliki player. Tiap bibit dari tanaman dilambangkan oleh inisial nama tanaman tersebut dan lowercase. Tanaman yang siap panen dilambangkan oleh inisial nama tanaman tersebut dan uppercase.\
Pada awal game, player akan memiliki 1000C dan tidak memiliki tanaman maupun bibit apapun.

Tanam bibit\
Pada menu ini, player dapat menanam bibit yang dimiliki. Mintalah user untuk memilih jenis bibit yang ingin ditanam terlebih dahulu (tampilkan pula jumlah bibit tiap tanaman yang dimiliki oleh player), lalu mintalah koordinat tempat bibit ditanam (koordinat dimulai dari 1). Berikut adalah contoh tampilannya.

```
Pilih bibit yang mau ditanam :
1. Bibit Anggrek - 1
2. Bibit Tulip - 1
3. Bibit Lily - 1
4. Bibit Mawar - 1
0. Batal
>> 1
Masukkan koordinat(x,y) : 5,10
Berhasil menanam bibit!
```

Beri pupuk\
Pada menu ini, user dapat memberikan pupuk ke bibit yang sudah ditanam. Tampilkan daftar pupuk beserta jumlah yang dimiliki oleh player, lalu mintalah koordinat bibit yang ingin diberi. Berikan pesan bila jumlah pupuk tidak cukup atau koordinat yang diisikan bukan merupakan bibit tanaman. Berikut tampilannya:

```
Pilih jenis pupuk yang ingin diberikan :
1. Pupuk kompos - 0
2. Pupuk kandang - 1
3. Pupuk kimia - 0
>> 2
Masukkan koordinat tanaman(x,y) : 5,10
Berhasil memberi pupuk untuk Bibit Anggrek!
```

Shop\
Pada menu ini player dapat membeli bibit tanaman dan pupuk. Berikan pesan bila coin user tidak mencukupi. Berikut tampilannya:

```
<- Shop ->
1. Beli bibit
2. Beli pupuk
0. Kembali
>> 1
Pilih bibit yang ingin dibeli :
1. Bibit Anggrek - 800C
2. Bibit Tulip - 300C
3. Bibit Lily - 200C
4. Bibit Mawar - 200C
>> 2
Jumlah yang ingin dibeli : 2
Berhasil membeli 2 Bibit Tulip!

<- Shop ->
1. Beli bibit
2. Beli pupuk
0. Kembali
>> 2
Pilih pupuk yang ingin dibeli :
1. Pupuk kompos - 75C
2. Pupuk kandang - 50C
3. Pupuk kimia - 20C
>> 1
Jumlah yang ingin dibeli : 2
Berhasil membeli 2 Pupuk kompos!
```

Panen\
Pada menu ini, player dapat memanen tanaman yang sudah siap panen. Untuk memanen, player perlu mengisikan koordinat tanaman yang ingin dipanen. Berikan pesan bila tanaman yang dipilih kosong atau belum siap panen.

```
DAY : 1
Coins : 1000C
---------------------
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | |a| | | | | |
---------------------
1. Tanam bibit
2. Beri pupuk
3. Shop
4. Panen
5. Jual hasil panen
6. Siram tanaman
7. Ganti hari
8. Lihat list tanaman pada kebun
0. Quit
>> 4
Masukkan koordinat tanaman yang ingin dipanen(x,y) : 5,10
Gagal memanen! Tanaman belum siap untuk dipanen!

DAY : 5
Coins : 1000C
---------------------
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | |A|A| | | | |
---------------------
1. Tanam bibit
2. Beri pupuk
3. Shop
4. Panen
5. Jual hasil panen
6. Siram tanaman
7. Ganti hari
8. Lihat List tanaman pada kebun
0. Quit
>> 4
Masukkan koordinat tanaman yang ingin dipanen(x,y) : 5,10
Berhasil memanen Anggrek!
```

Jual hasil panen\
Pada menu ini, player dapat menjual hasil panen yang dimiliki. Tampilkan juga jumlah tanaman yang dimiliki oleh player. Berikut tampilannya:

```
Pilih tanaman yang ingin dijual :
1. Anggrek (@500C) - 1
2. Tulip(@400C) - 0
3. Lily(@300C) - 0
4. Mawar (@250C) - 0
0. Kembali
>> 1
Masukkan jumlah : 1
Berhasil menjual 1 Anggrek! (+500C)
```

Siram tanaman\
Pada menu ini, player dapat menyiram bibit yang telah ditanam pada kebun dengan cara menginputkan koordinat bibit yang ingin disiram. Berikut tampilannya:

```
DAY : 1
Coins : 1000C
---------------------
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | |a| | | | | |
---------------------
1. Tanam bibit
2. Beri pupuk
3. Shop
4. Panen
5. Jual hasil panen
6. Siram tanaman
7. Ganti hari
8. Lihat list tanaman pada kebun
0. Quit
>> 6
Masukkan koordinat tanaman yang ingin dipanen(x,y) : 5,10
Berhasil menyiram tanaman!
```

Ganti hari\
Pada menu ini, hari akan bertambah 1. Pastikan juga semua tanaman agar dapat bertumbuh dengan benar. Berikut contoh perhitungan pertumbuhan tanaman yang benar:\
Misalkan bibit mawar ditanam pada hari ke-2, maka bila disiram setiap hari dan tidak diberi pupuk, bibit mawar akan bertumbuh menjadi tanaman mawar pada hari ke-6.

Lihat list tanaman pada kebun\
Pada menu ini, tampilkan semua bibit dan tanaman yang ada pada kebun. Untuk bibit, tampilkan dengan format: Bibit <nama_tanaman> (<x>,<y>) - <status_diberi_pupuk> - <status_disiram>. Untuk tanaman siap panen, tampilkan dengan format: <nama_tanaman> (<x>,<y>).

```
DAY : 1
Coins : 1000C
---------------------
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | |t| | | | |m| | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | | | |M| | | |
| | | | | | | | | | |
| | | | | | | | | | |
| | | | |a| | | | | |
---------------------
1. Tanam bibit
2. Beri pupuk
3. Shop
4. Panen
5. Jual hasil panen
6. Siram tanaman
7. Ganti hari
8. Lihat list tanaman pada kebun
0. Quit
>> 8
** List Tanaman pada Kebun **
-Bibit Tulip (3,4) - Belum diberi pupuk - Belum disiram
-Bibit Mawar (8,4) - Belum diberi pupuk - Belum disiram
-Mawar (7,7)
-Bibit Anggrek (5,10) - Sudah diberi pupuk - Sudah disiram
```

Catatan\
Untuk tiap inputan koordinat, berikan pesan bila inputan invalid.

### Tugas

Buatlah game Space Invaders Sederhana 🚀👽

Tampilan awal main menu

```
#-#-#-#-#-#-#-#
#             #
#   Space     #
#  Invaders   #
#             #
#-#-#-#-#-#-#-#
=== Main Menu ---
1. Play Game
2. Scoreboard
3. Exit
>>
```

Play Game\
Pada menu ini program akan memberi 3 pilihan difficulty untuk player. Masing-masing difficulty memiliki map yang berbeda-beda. Setelah memilih difficulty maka player akan diminta untuk menginputkan nama.

```
#-#-#-#-#-#-#-#
#             #
#   Space     #
#  Invaders   #
#             #
#-#-#-#-#-#-#-#
=== Main Menu ---
1. Play Game
2. Scoreboard
3. Exit
>> 1
--Choose Your Difficulty--
1. Easy
2. Medium
3. Hard
>> 1
--------------------------
Masukkan Nama Anda : Chen
```

Tampilan awal game sesuai difficulty:

```
  Difficulty Easy
#.................#
#      ZZZZZ      #
#       YY YY     #
#      XXXXX      #
#                 #
#                 #
#                 #
#                 #
#   ----    ----  #
#   -  -    -  -  #
#        Λ	      #
#.................#
Score : 0
Life : ♥ ♥ ♥
>>

  Difficulty Medium
#.................#
#    ZZZZZZZZZ    #
#  YYYY     YYYY  #
#     XXXXXXX     #
#                 #
#                 #
#                 #
#                 #
#   ----    ----  #
#   -  -    -  -  #
#        Λ	      #
#.................#
Score : 0
Life : ♥ ♥ ♥
>>

  Difficulty Hard
#.................#
#  ZZZZZZZZZZZZZZ #
#     XXYYYYXX    #
#      XXYYXX     #
#                 #
#                 #
#                 #
#                 #
#   ----    ----  #
#   -  -    -  -  #
#        Λ	      #
#.................#
Score : 0
Life : ♥ ♥ ♥
>>
```

Cara Bermain:\
Player\

-   Player hanya akan bisa begerak apabila diinputkan “a” atau “d”.
-   Jika input “a” maka gerakkan spaceship player ke kiri
-   Jika input “d” maka gerakkan spaceship player ke kanan
-   Jika input “w” maka spaceship akan menembakkan peluru
-   Player pada awal permainan memiliki 3 heart (nyawa)

Enemy

-   Musuh pada game ini memiliki 3 jenis, setiap musuh memiliki symbol peluru dan symbol spaceship yang berbeda-beda.
-   Jenis Musuh
    -   X: Tipe musuh pertama, musuh apabila musuh ini mati maka tambahkan score sebesar 10. Simbol spaceship pada map adalah X dan peluru yang ditembakan simbolnya adalah “i”. Persentase menembak adalah 30%
    -   Y: Tipe musuh kedua, musuh apabila musuh ini mati maka tambahkan score sebesar 20. Simbol spaceship pada map adalah Y dan peluru yang ditembakan simbolnya adalah “I”. Persentase menembak adalah 40%
    -   Z: Tipe musuh ketiga, musuh apabila musuh ini mati maka tambahkan score sebesar 30. Simbol spaceship pada map adalah Z dan peluru yang ditembakan simbolnya adalah “!”. Persentase menembak adalah 50%
-   Musuh hanya memiliki 1 nyawa saja, jadi apabila terkena peluru player maka musuh akan langsung
    mati.
-   Sistem Gerak Musuh - Musuh akan bergerak setiap kali player dan musuh akan bergerak ke kiri atau ke kanan atau ke bawah sebanyak 1x. - Semua musuh akan bergerak seragam jadi jika 1 musuh ke kiri maka semua musuh akan bergerak ke kiri - Pada awal game randomlah gerakkan musuh (kanan/kiri) kemudian semua musuh akan bergerak kanan/kiri hingga salah satu dari musuh sudah tidak bisa bergerak ke kanan/kiri - Musuh akan bergerak ke bawah 1x apabila terdapat musuh yang paling kiri/ kanan sudah tidak bisa bergerak ke kiri/kanan. Setelah musuh bergerak ke bawah maka musuh akan bergerak kebalikan dari sebelumnya.

    Contoh : Salah satu musuh tidak bisa bergerak ke kiri lagi, setelah player input suatu gerakkan maka musuh akan bergerak ke bawah 1x dan selanjutnya akan bergerak ke kanan hingga ada musuh yang tidak bisa bergerak ke kanan.

```
  Difficulty Hard
#.................#
#   ZZZZZZZZZZZZZZ#
#      XXYYYYXX   #
#       XXYYXX    #
#                 #
#                 #
#                 #
#                 #
#   ----    ----  #
#   -  -    -  -  #
#        Λ	      #
#.................#
Score : 0
Life : ♥ ♥ ♥
>> d
```

Karena Spaceship Z tidak bisa kearah kanan maka saat player bergerak, musuh akan bergerak ke bawah

```
  Difficulty Hard
#.................#
#                 #
#   ZZZZZZZZZZZZZZ#
#      XXYYYYXX   #
#       XXYYXX    #
#                 #
#                 #
#                 #
#   ----    ----  #
#   -  -    -  -  #
#         Λ       #
#.................#
Score : 0
Life : ♥ ♥ ♥
>> d
```

Kemudian arah gerak musuh akan ke kiri karena sebelumnya adalah kanan

```
  Difficulty Hard
#.................#
#                 #
#  ZZZZZZZZZZZZZZ #
#     XXYYYYXX    #
#      XXYYXX     #
#                 #
#                 #
#                 #
#   ----    ----  #
#   -  -    -  -  #
#          Λ      #
#.................#
Score : 0
Life : ♥ ♥ ♥
>> d
```

Sistem Shooting

-   Pada game ini, player dan musuh dapat menembak dan peluru beserta keterangannya akan dijelaskan tabel dibawah.
-   Peluru akan bergerak ketika player melakukan suatu action.
-   Sistem kerja musuh menembak adalah, musuh akan menembak apabila tidak ada halangan didepannya.

Contoh yang bakal menembak adalah 1 Spaceship Y paling kanan dan semua Spaceship X

```
#      ZZZZZ      #
#       YY YY     #
#      XXXXX      #
```

-   Setiap player melakukan suatu action (gerak dan menembak), musuh akan merandom kemungkinan musuh untuk menembak juga.
-   Saat player menembak menggunakan “w” maka tembakkan peluru diatas player. Apabila terkena musuh maka musuh tersebut akan mati.
-   Apabila peluru terkena tembok maka hilangkan 1 tembok tersebut yang terkena peluru
-   Apabila peluru musuh terkena player maka kurangilah nyawa player sebanyak 1.
-   Peluru akan dianggap kena suatu object apabila peluru tersebut telah melewati atau berada di koordinat yang sama.

```
  Difficulty Hard
#.................#
#                 #
#  ZZZZZZZZZZZZZZ #
#     XXYYYYXX    #
#      XXYYXX     #
#          I      #
#          I      #
#          |      #
#   ----    ----  #
#   -  -   |-  -  #
#          Λ      #
#.................#
Score : 0
Life : ♥ ♥ ♥
>> d

  Difficulty Hard
#.................#
#                 #
#  ZZZZZZZZZZZZZZ #
#     XXYYYYXX    #
#      XXYYXX     #
#                 #
#          I      #
#                 #
#   ----   |----  #
#   -  -    -  -  #
#           Λ     #
#.................#
Score : 0
Life : ♥ ♥ ♥
>> d

  Difficulty Hard
#.................#
#                 #
#  ZZZZZZZZZZZZZZ #
#     XXYYYYXX    #
#      XXYYXX     #
#                 #
#                 #
#                 #
#   ----    ----  #
#   -  -    -  -  #
#            Λ    #
#.................#
Score : 0
Life : ♥ ♥ ♥
>> d
```

| Jenis Spaceship | Peluru yang ditembakkan |
| --------------- | ----------------------- |
| X               | i                       |
| Y               | I                       |
| Z               | !                       |
| Player(Λ)       | \|                      |

Tembok

-   Tembok pada game ini akan berfungsi sebagai perlindang spaceship milik player. Apabila tembok terkena peluru dari player/ musuh maka tembok akan hilang.

Sistem Game

-   Pada awal permainan spaceship player akan selalu di tengah.
-   Map game akan ditentukan sesuai dengan pilihan difficulty yang dipilih oleh player.
-   Player dapat melakukan 3 action dalam game ini yaitu, “a” untuk bergerak ke kiri, “d” untuk bergerak ke kanan dan “w” untuk menembakkan peluru.
-   Game akan berakhir pada saat letak musuh ada di baris player atau menggunakan cheat atau nyawa player sudah habis. Akan terdapat pesan Game over apabila game sudah berakhir.
-   Saat game berakhir maka masukkan score player ke dalam scoreboard

Sistem Scoring

-   Setiap kali player menghancurkan spaceship musuh maka score akan bertambah berdasarkan jenis musuh spaceship yang di hancurkan.

Cheats

1. Saat player input “hesoyam” maka kembalikanlah nyawa player menjadi 3
2. Saat player input “end game” maka akhirlah game tersebut dengan score yang seadanya.
3. Saat player input “s” maka tambahkan koordinat Y musuh sebanyak 1.

Contoh :

```
  Difficulty Hard
#.................#
#                 #
#  ZZZZZZZZZZZZZZ #
#     XXYYYYXX    #
#      XXYYXX     #
#                 #
#                 #
#                 #
#   ----    ----  #
#   -  -    -  -  #
#            Λ    #
#.................#
Score : 0
Life : ♥ ♥ ♥
>> s
```

Saat Input player "s" maka musuhe akan bergerak (arah sebenarnya) + gerak kebawah 1x

```
  Difficulty Hard
#.................#
#                 #
#                 #
# ZZZZZZZZZZZZZZ  #
#    XXYYYYXX     #
#     XXYYXX      #
#                 #
#                 #
#   ----    ----  #
#   -  -    -  -  #
#            Λ    #
#.................#
Score : 0
Life : ♥ ♥ ♥
>>
```

Scoreboard\
Pada menu ini akan menampilkan semua player yang pernah bermain game ini. Kemudian urutkan berdasarkan score tertinggi ke terendah.

```
========Highscore========
1. Jasong - 100
2. Widean - 40
3. Chen - 20
=========================
```

Exit\
Pada menu ini program akan exit.

Note: Enemy Spaceship diwajibkan untuk menggunakan konsep Polymorphism
