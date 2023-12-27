# Tugas-Akhir
Laporan Praktikum

I. Tree
    A. Terminilogi Tree 
Terminologi Tree adalah istilah-istilah yang digunakan untuk menggambarkan struktur data pohon atau hirarki. Berikut adalah beberapa istilah dasar yang umum digunakan:
- Node (simpul): Titik individu dalam pohon yang menyimpan data.
- Root Node (simpul akar): Node paling atas dalam pohon yang menjadi awal dari struktur.
- Leaf Node (simpul daun): Node yang tidak memiliki anak, berada di ujung pohon.
- Parent Node (simpul induk): Node yang memiliki anak-anak.
- Child Node (simpul anak): Node yang berada di bawah node induk.
- Siblings (saudara): Node-node dengan induk yang sama.
- Subtree (pohon anak): Bagian dari pohon yang terdiri dari node tertentu dan semua anaknya.
- Level (tingkatan): Jarak dari simpul tertentu ke simpul akar, dengan simpul akar berada pada tingkat 0.
- Depth (kedalaman): Jarak dari suatu simpul ke simpul akar.
- Height (tinggi): Jumlah tingkatan atau tingkatan terjauh dari pohon.
- Binary Tree: Pohon di mana setiap simpul memiliki paling banyak dua anak.
- Binary Search Tree (BST): Binary Tree dengan properti bahwa anak kiri memiliki nilai yang lebih kecil dan anak kanan memiliki nilai yang lebih besar dari simpul induknya.

Ini adalah istilah-istilah dasar yang digunakan untuk menggambarkan struktur data pohon atau hirarki, dan pemahaman mereka sangat membantu saat bekerja dengan pohon atau struktur data serupa.

   class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinaryTreeExample {
    public static void main(String[] args) {
        // Membuat simpul-simpul (nodes) untuk binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Menampilkan hasil
        System.out.println("Contoh Binary Tree:");
        System.out.println("    1");
        System.out.println("   / \\");
        System.out.println("  2   3");
        System.out.println(" / \\");
        System.out.println("4   5");
    }
}

   B. Binary Search Tree
   1. Binary tree
      Binary Tree adalah seperti pohon yang setiap simpulnya punya maksimal dua cabang. Bayangkan kita punya keluarga dengan setiap orang tua punya dua anak. Itulah seperti Binary Tree, di mana setiap orang tua (simpul) punya dua anak (cabang).
Contoh sederhana:
   1
  / \
 2   3
Jadi, Binary Tree itu seperti pohon keluarga di mana setiap orang tua punya paling banyak dua anak.

CONTOH:
Diberikan urutan angka berikut: 4, 2, 6, 1, 3, 5, 7. Sisipkan angka-angka ini ke dalam Binary Tree secara berurutan.
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int value) {
        this.val = value;
        this.left = this.right = null;
    }
}

public class SimpleBinaryTree {

    public static void main(String[] args) {
        int[] numbers = {4, 2, 6, 1, 3, 5, 7};
        
        TreeNode root = buildBinaryTree(numbers);

        System.out.println("In-order traversal:");
        inOrderTraversal(root);
    }

    static TreeNode buildBinaryTree(int[] numbers) {
        TreeNode root = null;
        for (int number : numbers) {
            root = insert(root, number);
        }
        return root;
    }

    static TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.val) {
            root.left = insert(root.left, value);
        } else if (value > root.val) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    static void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }
}


3. Binary Search tree
  Binary Search Tree (BST) adalah seperti pohon di mana setiap anak kiri harus lebih kecil daripada orang tuanya, dan setiap anak kanan harus lebih besar.
Contoh Sederhana:
Bayangkan kita punya daftar angka dan kita ingin menyusunnya seperti pohon. Setiap angka lebih kecil dari orang tuanya ditaruh di sebelah kiri, dan yang lebih besar ditaruh di sebelah kanan.
Contoh:
Jika kita punya 5 sebagai angka pertama, maka angka berikutnya yang lebih kecil akan ditaruh di sebelah kiri, dan yang lebih besar ditaruh di sebelah kanan.
Jika kita punya 3, itu akan jadi anak kiri dari 5.
Jika kita punya 8, itu akan jadi anak kanan dari 5.
Begitu seterusnya. Jadi, BST itu seperti pohon di mana kita tata angka sedemikian rupa sehingga kita bisa dengan cepat mencari atau menyisipkan angka.

CONTOH:
Diberikan urutan angka berikut: 5, 3, 8, 1, 4, 6, 9. Sisipkan angka-angka ini ke dalam Binary Search Tree secara berurutan.
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int value) {
        this.val = value;
        this.left = this.right = null;
    }
}

public class SimpleBST {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 4, 6, 9};
        
        // Membuat pohon BST
        TreeNode root = null;
        for (int number : numbers) {
            root = insert(root, number);
        }

        // Menampilkan hasil traversal inorder
        System.out.println("In-order traversal:");
        inOrderTraversal(root);
    }

    static TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.val) {
            root.left = insert(root.left, value);
        } else if (value > root.val) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    static void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }
}
Program ini membuat Binary Search Tree dengan menyisipkan angka-angka ke dalamnya secara berurutan dan kemudian menampilkan hasil in-order traversal.


   C. Traversal
   Traversal atau penelusuran adalah seperti berjalan-jalan di sepanjang jalur tertentu untuk melihat atau melakukan sesuatu pada setiap hal yang kita temui.

Contoh Sederhana:
Bayangkan kita berjalan melintasi deretan buah di kebun dan melihat setiap pohon buah. Saat kita berjalan, kita mungkin memeriksa setiap buah di pohon untuk melihat apakah sudah matang atau belum. Traversing kebun buah dalam hal ini adalah seperti kita "melangkah" dari satu pohon ke pohon lainnya untuk memeriksa buahnya.

Dalam pemrograman:
Array: Traversing array seperti kita melihat setiap nilai satu per satu, seperti mengunjungi setiap rumah di sepanjang jalan.
Pohon atau Grafik: Traversing struktur seperti pohon atau grafik mirip dengan berjalan melalui cabang-cabang atau simpul-simpul untuk melihat apa yang ada di dalamnya.

Jadi, traversing itu seperti langkah-langkah perlahan untuk melihat atau berinteraksi dengan setiap bagian dalam suatu kumpulan data atau struktur.
   
   
   1. Pre Order
     Traversal pre-order itu seperti mengikuti urutan langkah-langkah sederhana di mana kita:
Langkah Pertama: Mengunjungi orang tua (root).
Langkah Kedua: Pergi ke anak kiri.
Langkah Ketiga: Mengunjungi anak kiri dari anak kiri.
Langkah Keempat: Mengunjungi anak kanan dari anak kiri.
Langkah Kelima: Mengunjungi anak kanan.
Contoh: Dengan pohon sederhana A - B - D - E - C, kita akan mengunjungi node sesuai dengan urutan tersebut: A, B, D, E, C.

Jadi, pre-order itu seperti cara kita melakukan langkah-langkah dengan mengunjungi orang tua terlebih dahulu, kemudian anak kiri, dan akhirnya anak kanan.

CONTOH:
Diberikan pohon biner sederhana seperti berikut:
    1
   / \
  2   3
 / \
4   5
Tulislah program Java untuk melakukan pre-order traversal pada pohon ini.
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int value) {
        this.val = value;
        this.left = this.right = null;
    }
}

public class PreOrderTraversal {

    public static void main(String[] args) {
        // Membuat pohon
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Memanggil fungsi pre-order traversal
        preOrderTraversal(root);
    }

    static void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
}
Program ini melakukan pre-order traversal pada pohon biner dan mencetak nilai setiap node dalam urutan yang benar.


2. In Order
   Traversal in-order itu seperti membaca buku dari halaman paling kiri ke halaman paling kanan, mengikuti urutan halaman anak kiri, kemudian halaman induk, dan terakhir halaman anak kanan.

Contoh Sederhana:
Bayangkan buku yang terbuka, dan kamu membaca halaman berurutan:

- Halaman Pertama: Buka ke halaman anak kiri (D).
- Halaman Kedua: Baca halaman induk (B).
- Halaman Ketiga: Buka ke halaman anak kanan (E).
- Halaman Keempat: Baca halaman induk (A).
- Halaman Kelima: Buka ke halaman anak kanan (C).
Jadi, in-order itu seperti membaca buku dengan mengikuti urutan halaman secara berurutan, dari anak kiri, induk, hingga anak kanan.

CONTOH:
Diberikan pohon biner sederhana seperti berikut:
    1
   / \
  2   3
 / \
4   5
Tulislah program Java untuk melakukan in-order traversal pada pohon ini.
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int value) {
        this.val = value;
        this.left = this.right = null;
    }
}

public class InOrderTraversal {

    public static void main(String[] args) {
        // Membuat pohon
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Memanggil fungsi in-order traversal
        inOrderTraversal(root);
    }

    static void inOrderTraversal(TreeNode root) {
        if (root == null)
            return;

        // Traverse ke anak kiri terlebih dahulu
        inOrderTraversal(root.left);

        // Kunjungi node saat ini
        System.out.print(root.val + " ");

        // Traverse ke anak kanan
        inOrderTraversal(root.right);
    }
}
Program ini melakukan in-order traversal pada pohon biner dan mencetak nilai setiap node dalam urutan yang benar.


3. Post Order
   Traversal post-order itu seperti urutan langkah-langkah di mana kita pergi ke anak-anak terlebih dahulu sebelum kembali ke "rumah" atau "ibu kota".
Contoh Sederhana:
Bayangkan kita menjelajahi hutan dengan cara berikut:
- Langkah Pertama: Jelajahi hutan sejauh mungkin ke arah kiri.
- Langkah Kedua: Jika tidak ada lagi jalan ke kiri, pindah ke kanan satu langkah.
- Langkah Ketiga: Ulangi langkah 1 dan 2 hingga selesai menjelajahi.
Dalam konteks pohon, langkah pertama ini adalah mengunjungi anak-anak (cabang-cabang) sebelum mengunjungi node induk (pohon utama).

Jadi, post-order itu seperti cara kita menjelajahi hutan dengan terlebih dahulu menyusuri jalur kecil di sebelah kiri sebelum kembali ke jalur utama.

CONTOH:
Diberikan pohon biner sederhana seperti berikut:
    1
   / \
  2   3
 / \
4   5
Tulislah program Java untuk melakukan post-order traversal pada pohon ini.
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int value) {
        this.val = value;
        this.left = this.right = null;
    }
}

public class PostOrderTraversal {

    public static void main(String[] args) {
        // Membuat pohon
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Memanggil fungsi post-order traversal
        postOrderTraversal(root);
    }

    static void postOrderTraversal(TreeNode root) {
        if (root == null)
            return;

        // Traverse ke anak-anak terlebih dahulu
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);

        // Kunjungi node saat ini
        System.out.print(root.val + " ");
    }
}
Program ini melakukan post-order traversal pada pohon biner dan mencetak nilai setiap node dalam urutan yang benar.


4. Level Order
   Level order, atau urutan tingkat, itu seperti menyusuri atau mengunjungi setiap tingkat satu per satu, mulai dari tingkat atas.
Contoh: Bayangkan kita punya pohon seperti tangga.
    A
   / \
  B   C
 / \   \
D   E   F
Jika kita melakukan level order traversal, kita akan mengunjungi node satu per satu pada setiap tingkat:

Tingkat Pertama: A
Tingkat Kedua: B, C
Tingkat Ketiga: D, E, F
Jadi, level order itu seperti naik atau turun tangga, mengunjungi satu tingkat setelah tingkat yang sebelumnya.

CONTOH:
Diberikan pohon biner sederhana seperti berikut:
    1
   / \
  2   3
 / \
4   5
Tulislah program Java untuk melakukan level order traversal pada pohon ini.
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int value) {
        this.val = value;
        this.left = this.right = null;
    }
}

public class LevelOrderTraversal {

    public static void main(String[] args) {
        // Membuat pohon
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Memanggil fungsi level order traversal
        levelOrderTraversal(root);
    }

    static void levelOrderTraversal(TreeNode root) {
        if (root == null)
            return;

        // Membuat antrian (queue) untuk penelusuran
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        // Melakukan level order traversal
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");

            // Menambahkan anak-anak ke antrian
            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);
        }
    }
}
Program ini menggunakan struktur pohon biner sederhana dan melakukan level order traversal untuk mencetak nilai setiap node. Perhatikan penggunaan antrian (Queue) untuk menjaga urutan penelusuran.



II. Searching
   Searching atau pencarian adalah proses mencari suatu nilai atau informasi dalam suatu kumpulan data atau daftar. Ini mirip dengan mencari sesuatu dalam buku telepon atau kamus, di mana kamu mencoba menemukan informasi tertentu berdasarkan kriteria tertentu.
Misalnya, bayangkan kamu memiliki daftar angka dari 1 hingga 100 dan kamu ingin menemukan angka 42. Proses mencari nilai 42 dalam daftar tersebut adalah contoh dari operasi pencarian. Tujuannya adalah menemukan apakah nilai yang dicari ada di dalam kumpulan data dan, jika ya, di mana posisinya.

Metode pencarian bisa bervariasi, dan beberapa metode mencakup melihat satu per satu (sequential search), membagi menjadi dua (binary search), atau menggunakan fungsi khusus (hashing) untuk menemukan nilai yang dicari.

   A. Squensial Search
   Sequential Search itu seperti mencari kunci di seluruh rumah satu per satu sampai kita menemukannya.
- Mulai dari Awal Rumah: Kita mulai dari pintu depan (elemen pertama kumpulan data).
- Periksa Setiap Kunci: Kita periksa setiap kunci yang ada di rumah (elemen dalam kumpulan data) satu per satu.
- Cocokkan dengan Kunci yang Dicari: Jika kita menemukan kunci yang sesuai dengan yang dicari, kita berhenti pencarian.
- Lanjut ke Kunci Berikutnya: Jika tidak cocok, kita lanjutkan ke kunci berikutnya.
- Ulangi Sampai Ketemu atau Selesai: Langkah-langkah ini diulang sampai kita menemukan kunci yang dicari atau kita telah memeriksa semua kunci di rumah (sampai akhir kumpulan data).

Jadi, Sequential Search itu seperti mencari dengan cara yang sangat sederhana, tapi kita perlu memeriksa satu per satu.

CONTOH: temukan tinggi badan tertinggi
public class SequentialSearchExample {

    public static void main(String[] args) {
        // Array tinggi badan terurut
        int[] heights = {160, 165, 170, 175, 180};
        
        // Tinggi badan tertinggi yang dicari
        int targetHeight = 180;

        // Mencari tinggi badan tertinggi menggunakan Sequential Search
        int result = sequentialSearch(heights, targetHeight);

        // Menampilkan hasil pencarian
        if (result != -1) {
            System.out.println("Tinggi badan tertinggi " + targetHeight + " cm ditemukan pada indeks " + result + ".");
        } else {
            System.out.println("Tinggi badan tertinggi " + targetHeight + " cm tidak ditemukan.");
        }
    }

    static int sequentialSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Mengembalikan indeks jika ditemukan
            } else if (array[i] > target) {
                break; // Menghentikan pencarian jika nilai lebih besar dari yang dicari (karena sudah terurut)
            }
        }
        return -1; // Mengembalikan -1 jika tidak ditemukan
    }
}
Dalam contoh ini, pencarian akan berhenti lebih cepat jika nilai yang dicari lebih kecil dari elemen saat ini karena array sudah terurut. Hal ini memanfaatkan sifat array terurut untuk mengoptimalkan pencarian. Program ini mencari tinggi badan tertinggi dalam array menggunakan Sequential Search. Jika ditemukan, program akan memberikan indeks di mana tinggi badan tersebut ditemukan; jika tidak, program memberikan pesan bahwa tinggi badan tersebut tidak ditemukan.

B. Interpolation Search
Interpolation Search itu seperti menebak tempat di antara dua nilai yang tahu-tahu bisa membawa kita langsung ke nilai yang dicari.
- Menebak Posisi Awal: Pertama, kita lihat di dua ujung (misalnya, di 10 dan 60).
- Menghitung Estimasi: Jika nilai yang dicari (misalnya, 40) berada di sekitar setengah jarak antara 10 dan 60, kita mengasumsikan dia mungkin berada di sekitar posisi 40.
- Cek dan Pindah: Sekarang kita lihat nilai di posisi 40. Jika dia tepat, pencarian selesai. Jika terlalu besar, kita tahu dia harus berada di setengah kiri (lebih dekat ke 10), dan sebaliknya jika terlalu kecil.
- Ulangi Sampai Ketemu: Langkah-langkah ini diulang sampai kita menemukan nilai yang dicari atau sampai tidak bisa lagi membagi rentang.
Jadi, Interpolation Search itu seperti menebak dengan cerdas di mana nilai yang dicari mungkin berada dan mempersempit pilihan dengan cepat.
Kelebihan Interpolation Search adalah efektif untuk data yang terus menerus, namun kurang efisien untuk data yang memiliki nilai yang terlalu bervariasi atau mendekati nilai ekstrim. Metode ini lebih cocok untuk data yang memiliki distribusi merata.

CONTOH:
  public class InterpolationSearchExample {

    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int targetValue = 40;

        int result = interpolationSearch(sortedArray, targetValue);

        if (result == -1) {
            System.out.println("Angka " + targetValue + " tidak ditemukan.");
        } else {
            System.out.println("Angka " + targetValue + " ditemukan di indeks " + result + ".");
        }
    }

    static int interpolationSearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high && target >= array[low] && target <= array[high]) {
            // Rumus interpolasi
            int pos = low + ((target - array[low]) * (high - low)) / (array[high] - array[low]);

            if (array[pos] == target) {
                return pos;
            }

            if (array[pos] < target) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }

        return -1;
    }
}
Dalam contoh ini, metode interpolationSearch melakukan pencarian nilai target dalam array yang sudah diurutkan menggunakan pendekatan Interpolation Search. Jika nilai ditemukan, program memberikan indeks di mana nilai tersebut ditemukan. Jika tidak, program memberikan pesan bahwa nilai tidak ditemukan.

C. Binary Search
Binary search itu seperti bermain tebak-tebakan angka di mana kita terus membagi pilihan kita menjadi dua setiap kali kita mendapat jawaban 'terlalu besar' atau 'terlalu kecil'.
- Pertama, kita lihat di tengah: Kita lihat angka di tengah kumpulan data.
- Apakah itu jawabannya?: Jika angka di tengah itu tepat (misalnya, kita mencari 25 dan menemukannya di tengah), pencarian selesai.
- Terlalu besar atau terlalu kecil?: Jika angka di tengah terlalu besar, kita hanya perlu melihat setengah kiri. Jika terlalu kecil, kita hanya perlu melihat setengah kanan.
- Ulangi: Kemudian kita ulangi proses ini di setengah yang kita pilih, terus-menerus membagi pilihan kita hingga kita temukan angka yang kita cari.

Ini seperti menebak angka di tengah-tengah rentang angka sampai kita temukan jawabannya.

CONTOH:
Diberikan array yang sudah diurutkan [10, 20, 30, 40, 50, 60, 70, 80, 90]. Buatlah program Java untuk mencari apakah nilai 30 terdapat dalam array tersebut. Jika ada, tampilkan indeksnya; jika tidak, tampilkan pesan bahwa nilai tidak ditemukan.
public class SimpleBinarySearchExample {

    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int targetValue = 30;

        int result = binarySearch(sortedArray, targetValue);

        if (result == -1) {
            System.out.println("Angka " + targetValue + " tidak ditemukan.");
        } else {
            System.out.println("Angka " + targetValue + " ditemukan di indeks " + result + ".");
        }
    }

    static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}



III. Hash Table
   Hash table adalah struktur data yang digunakan untuk menyimpan dan mengakses data dengan menggunakan fungsi hash. Fungsi hash mengonversi kunci atau identifier data menjadi indeks atau alamat dalam tabel. Proses ini memungkinkan akses data dengan cepat karena kita dapat langsung menuju lokasi yang tepat di dalam tabel.
   Hash table mirip dengan cara kita menyimpan kunci dan nilai dalam suatu kotak dengan nomor tertentu. Bayangkan kita memiliki sebuah kotak besar yang terbagi menjadi sejumlah kotak kecil, dan setiap kotak kecil memiliki nomor unik.
    hash table adalah cara cepat dan efisien untuk menyimpan dan mencari data dengan menggunakan nomor atau "kode pos" khusus.
   
   A. Hash Function
   Fungsi hash itu seperti mesin ajaib yang mengubah sesuatu (misalnya kata atau angka) menjadi nomor khusus. Bayangkan mesin itu seperti kotak ajaib yang selalu memberikan nomor yang sama untuk barang yang sama. Jadi, setiap kali Kamu memberi mesin itu sesuatu, itu memberi Kamu nomor khusus untuk itu.
   CONTOH:
   kita ingin membuat nomor unik untuk setiap buah dengan menjumlahkan panjang nama buahnya. Misalnya, panjang nama "apple" adalah 5, sehingga nomor uniknya menjadi 5.

   public class SimpleHashFunction {

    public static int simpleFruitHash(String fruitName) {
        int hashValue = fruitName.length();
        return hashValue;
    }

    public static void main(String[] args) {
        String fruit = "apple";
        int uniqueNumber = simpleFruitHash(fruit);
        System.out.println("Unique number for '" + fruit + "': " + uniqueNumber);
    }
}
Penjelasan:
- Kelas SimpleHashFunction memiliki metode simpleFruitHash yang menggunakan panjang nama buah sebagai nilai hash.
- fruitName.length() memberikan panjang nama buah.
- Hasilnya adalah nomor yang mewakili buah tersebut.
- main metode digunakan untuk contoh penggunaan.

3. Hash Table di Java
   a. direct hash Function
   Direct Hash Function itu seperti menggunakan nomor kunci (misalnya ID) langsung sebagai alamat di dalam kotak penyimpanan. Misalnya, jika kita punya buku dengan nomor ID 50, kita langsung simpan bukunya di kotak nomor 50. Ini seperti menyimpan barang di laci yang nomornya sama dengan nomor barang itu sendiri.
   Kelebihannya sederhana dan cepat, tapi ada risiko jika nomor kunci terlalu besar atau tidak tersebar merata. Jadi, meski simpel, kadang-kadang kita butuh cara lebih pintar untuk mengatur agar lebih efisien.
   CONTOH:
   Buatlah sistem Direct Hash Function sederhana untuk menyimpan dan mencari buah berdasarkan nama buahnya. Gunakan ID buah sebagai nilai kunci (misalnya, nomor urut).
   import java.util.HashMap;

public class SimpleFruitHashing {

    public static void main(String[] args) {
        // Inisialisasi hash map untuk menyimpan buah berdasarkan ID
        HashMap<Integer, String> fruitHashMap = new HashMap<>();

        // Menambahkan buah ke dalam hash map
        addFruit(fruitHashMap, 1, "Apple");
        addFruit(fruitHashMap, 2, "Banana");
        addFruit(fruitHashMap, 3, "Orange");

        // Mencari buah berdasarkan ID
        findFruit(fruitHashMap, 2);
        findFruit(fruitHashMap, 4); // ID yang tidak ada

    }

    // Fungsi untuk menambahkan buah ke dalam hash map
    public static void addFruit(HashMap<Integer, String> map, int id, String name) {
        map.put(id, name);
        System.out.println("Added " + name + " with ID " + id + " to the fruit hash map.");
    }

    // Fungsi untuk mencari buah berdasarkan ID
    public static void findFruit(HashMap<Integer, String> map, int id) {
        if (map.containsKey(id)) {
            String fruitName = map.get(id);
            System.out.println("Fruit with ID " + id + " found: " + fruitName);
        } else {
            System.out.println("Fruit with ID " + id + " not found.");
        }
    }
}

Penjelasan:

- Program menggunakan HashMap untuk menyimpan buah berdasarkan ID.
- addFruit digunakan untuk menambahkan buah ke dalam HashMap.
- findFruit digunakan untuk mencari buah berdasarkan ID dan memberikan feedback apakah buah tersebut ditemukan atau tidak.

2. Step Hash Function
   Step Hash Function mirip dengan cara kita membuat resep. Bayangkan kita memiliki bahan makanan (data atau kunci), dan kita mengikuti langkah-langkah tertentu (operasi atau proses) untuk membuat hidangan (nilai hash).
Contohnya seperti ini:
- Ambil setiap huruf dalam kata.
- Hitung jumlah (atau lakukan operasi lain) dari nilai huruf-huruf tersebut.
- Hasilnya adalah "hidangan" atau nilai hash kita.
Jadi, Step Hash Function adalah seperti membuat sesuatu dengan langkah-langkah khusus pada data, dan hasil akhirnya adalah nilai hash yang unik untuk data tersebut.

CONTOH:
Kita akan menjumlahkan panjang nama buah sebagai langkah-langkahnya.
public class SimpleStepHashing {

    public static void main(String[] args) {
        // Contoh buah
        String fruit = "apple";

        // Menggunakan Step Hash Function
        int hashValue = stepHashFunction(fruit);

        // Menampilkan hasil
        System.out.println("Hash value for '" + fruit + "': " + hashValue);
    }

    // Fungsi Step Hash Function
    public static int stepHashFunction(String input) {
        // Menggunakan langkah-langkah sederhana: menjumlahkan panjang nama buah
        int hashValue = input.length();

        return hashValue;
    }
}
Penjelasan:

- Program ini memiliki fungsi stepHashFunction yang sangat sederhana. Langkah-langkahnya adalah hanya menjumlahkan panjang nama buah.
- Dalam contoh ini, kata "apple" akan diubah menjadi nilai hash dengan menjumlahkan panjangnya, yaitu 5.
- Hasil akhirnya adalah nilai hash yang sangat sederhana dan merepresentasikan nama buah tersebut.


IV. Sorting
   Sorting adalah proses pengurutan atau penyusunan data dalam suatu urutan tertentu. Tujuan dari pengurutan adalah untuk menyusun elemen-elemen data dalam urutan yang teratur, sehingga memudahkan proses pencarian dan pengambilan informasi. Terdapat berbagai algoritma pengurutan yang digunakan untuk menyusun data, dan pemilihan algoritma bergantung pada kebutuhan dan karakteristik data yang diurutkan.

Beberapa algoritma pengurutan umum meliputi:
a. Bubble Sort: Membandingkan dan menukar elemen-elemen data secara berurutan hingga seluruh data terurut.
CONTOH:
Diberikan array berikut: {5, 2, 8, 1, 6}. Urutkan array ini menggunakan algoritma Bubble Sort secara ascending.
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 6};

        System.out.println("Array sebelum diurutkan:");
        printArray(array);

        // Panggil fungsi Bubble Sort
        bubbleSort(array);

        System.out.println("\nArray setelah diurutkan:");
        printArray(array);
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Tukar elemen jika diperlukan
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
Program ini menggunakan algoritma Bubble Sort untuk mengurutkan array secara ascending. Algoritma ini bekerja dengan membandingkan elemen-elemen berturut-turut dan menukar mereka jika diperlukan, sehingga elemen terbesar "naik" ke posisi yang benar pada setiap iterasi.

b. Selection Sort: Mencari elemen terkecil dan menukarnya dengan elemen pertama, lalu mencari elemen terkecil dari sisa data dan menukarnya dengan elemen kedua, dan seterusnya.
CONTOH:
Diberikan array berikut: {3, 1, 4, 1, 5, 9, 2, 6}. Urutkan array ini menggunakan algoritma Selection Sort secara ascending.
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6};

        System.out.println("Array sebelum diurutkan:");
        printArray(array);

        // Panggil fungsi Selection Sort
        selectionSort(array);

        System.out.println("\nArray setelah diurutkan:");
        printArray(array);
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                // Cari indeks elemen terkecil
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Tukar elemen terkecil dengan elemen pertama yang belum diurutkan
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
Program ini menggunakan algoritma Selection Sort untuk mengurutkan array secara ascending. Algoritma ini bekerja dengan mencari elemen terkecil dalam array dan menukarnya dengan elemen pertama yang belum diurutkan pada setiap iterasi.

c. Insertion Sort: Memasukkan satu per satu elemen data ke dalam posisi yang sesuai dalam data yang sudah terurut.
Diberikan array berikut: {7, 2, 4, 1, 5, 3}. Urutkan array ini menggunakan algoritma Insertion Sort secara ascending.
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {7, 2, 4, 1, 5, 3};

        System.out.println("Array sebelum diurutkan:");
        printArray(array);

        // Panggil fungsi Insertion Sort
        insertionSort(array);

        System.out.println("\nArray setelah diurutkan:");
        printArray(array);
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Geser elemen-elemen yang lebih besar dari key ke posisi kanan
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
Program ini menggunakan algoritma Insertion Sort untuk mengurutkan array secara ascending. Algoritma ini bekerja dengan "menyisipkan" setiap elemen ke dalam posisi yang benar pada setiap iterasi, sehingga bagian array yang sudah diurutkan semakin bertambah.

d. Merge Sort: Memecah data menjadi dua bagian, mengurutkan masing-masing bagian, dan menggabungkannya kembali.
e. Quick Sort: Memilih elemen tertentu sebagai pivot, mempartisi data menjadi dua bagian (lebih kecil dari pivot dan lebih besar dari pivot), dan mengurutkan kedua bagian tersebut.
f. Heap Sort: Membangun struktur data heap dan mengambil elemen terbesar (pada heap maksimum) secara berulang hingga seluruh data terurut.

Setiap algoritma pengurutan memiliki kompleksitas waktu yang berbeda-beda dalam hal kinerja, tergantung pada ukuran data dan struktur data yang digunakan. Pemilihan algoritma pengurutan yang tepat dapat mempengaruhi efisiensi operasi pengurutan dalam suatu program.


V. Spring web
- Spring Web adalah Bagian dari Spring Framework: Ini membantu kita membuat aplikasi web dengan mudah menggunakan Java.
- MVC untuk Mengelola Logika: Spring Web menggunakan pola desain MVC untuk memisahkan tugas dalam aplikasi. Model (data), View (tampilan), dan Controller (logika) bekerja bersama.
- Dependency Injection (DI): Konsep ini membuat pengaturan dan manajemen aplikasi lebih mudah. Spring Web membantu kita mengatur ketergantungan antar kelas.
- Spring Boot untuk Pengembangan Cepat: Spring Boot membuat pengembangan aplikasi web lebih cepat dengan memberikan pengaturan otomatis dan aturan yang jelas.
- RESTful Web Services: Spring Web mendukung pembuatan layanan web RESTful, memudahkan komunikasi antar aplikasi.
- Integrasi dengan Teknologi Web Modern: Spring Web dapat berkolaborasi dengan teknologi web modern seperti HTML5, CSS, dan JavaScript.
- Keamanan dengan Spring Security: Spring Security membantu kita melindungi aplikasi web dari akses yang tidak sah dan memberikan kontrol otorisasi.


  VI. Graph
  Graph (graf) adalah struktur data yang terdiri dari simpul-simpul (nodes) yang terhubung oleh sisi-sisi (edges). Graph digunakan untuk merepresentasikan hubungan atau keterkaitan antar objek. Dalam graph, setiap simpul mewakili objek, dan setiap sisi mewakili hubungan atau koneksi antara dua objek tersebut.
   graph dengan lebih sederhana:
- Node (simpul): Titik atau objek dalam graph, seperti kota atau titik dalam peta.
- Sisi (edge): Koneksi antar dua simpul. Ini bisa berupa garis atau panah yang menghubungkan dua kota.
- Terarah atau Tidak Terarah:
- Terarah: Jika sisi memiliki arah, misalnya A ke B, berarti bisa dari A ke B tapi tidak sebaliknya.
- Tidak Terarah: Jika sisi tidak memiliki arah, misalnya A terhubung dengan B, berarti bisa dari A ke B atau sebaliknya.
- Contoh Keseharian: Graph bisa mewakili jaringan sosial (simpul adalah orang, sisi adalah pertemanan), peta jalan (simpul adalah persimpangan, sisi adalah jalan), dan banyak lagi.

Jadi, graph adalah cara untuk merepresentasikan hubungan atau keterkaitan antar objek dengan menggunakan simpul dan sisi.

Berikut adalah beberapa jenis graph yang umum:
- Graph Tidak Terarah (Undirected Graph): Sisi-sisinya tidak memiliki arah. Hubungan antara dua simpul bersifat dua arah atau saling menguntungkan.
 Contoh Graph Tidak Terarah:
A -- B
|    |
C -- D
Dalam contoh ini, terdapat empat simpul: A, B, C, dan D. Setiap garis menghubungkan dua simpul, menunjukkan hubungan yang tidak memiliki arah. Sebagai contoh, garis antara A dan B bisa diartikan sebagai A terhubung ke B dan sebaliknya.
Graph ini juga bisa diwakili dalam bentuk matriks ketetanggan, dengan entri-eentri yang menunjukkan keberadaan sisi antar simpul.
Contoh Graph Tidak Terarah dalam Bentuk Matriks Ketetanggan:
   A  B  C  D
A  0  1  1  0
B  1  0  1  0
C  1  1  0  1
D  0  0  1  0
Dalam matriks ini, nilai 1 menunjukkan bahwa ada sisi antara dua simpul, dan nilai 0 menunjukkan tidak adanya sisi. Dengan demikian, A terhubung ke B, B terhubung ke A dan C, dan seterusnya.
contoh kodingan Java sederhana
import java.util.*;

public class UndirectedGraphExample {

    public static void main(String[] args) {
        int numVertices = 4;
        int[][] adjacencyMatrix = {
            {0, 1, 1, 0},
            {1, 0, 0, 1},
            {1, 0, 0, 1},
            {0, 1, 1, 0}
        };

        System.out.println("Graph Representation using Adjacency Matrix:");
        printGraph(adjacencyMatrix, numVertices);
    }

    static void printGraph(int[][] matrix, int numVertices) {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
Pada contoh ini, kita menggunakan matriks ketetanggan untuk merepresentasikan graph tidak terarah dengan empat simpul (A, B, C, D). Nilai 1 di baris i dan kolom j menunjukkan adanya sisi antara simpul i dan simpul j. Output dari program ini akan menampilkan matriks ketetanggan yang merepresentasikan graph tidak terarah. Pastikan Anda memahami bahwa ini hanyalah salah satu cara merepresentasikan graph, dan masih ada berbagai metode lain yang dapat digunakan tergantung pada kebutuhan spesifik dari aplikasi Anda.

- Graph Terarah (Directed Graph): Sisi-sisinya memiliki arah. Setiap sisi memiliki simpul awal dan simpul tujuan, mengindikasikan arah hubungan.
  Contoh Graph Terarah:
  A --> B
^     |
|     v
D <-- C
Dalam contoh ini, terdapat empat simpul: A, B, C, dan D. Setiap panah menunjukkan arah hubungan dari simpul awal ke simpul tujuan. Sebagai contoh, panah dari A ke B menunjukkan bahwa A terhubung ke B, tetapi B tidak terhubung ke A.
Graph ini juga bisa diwakili dalam bentuk matriks ketetanggan, dengan entri-eentri yang menunjukkan keberadaan sisi antar simpul.
Contoh Graph Terarah dalam Bentuk Matriks Ketetanggan:
   A  B  C  D
A  0  1  0  1
B  0  0  1  0
C  0  0  0  1
D  0  1  0  0
Dalam matriks ini, nilai 1 menunjukkan bahwa ada sisi dari simpul awal ke simpul tujuan, dan nilai 0 menunjukkan tidak adanya sisi. Sebagai contoh, A terhubung ke B dan D, tetapi B tidak terhubung ke A, dan seterusnya.
contoh kodingan Java sederhana :
import java.util.*;

public class DirectedGraphExample {

    public static void main(String[] args) {
        int numVertices = 4;
        int[][] adjacencyMatrix = {
            {0, 1, 0, 1},
            {0, 0, 1, 0},
            {0, 0, 0, 1},
            {0, 1, 0, 0}
        };

        System.out.println("Graph Representation using Adjacency Matrix:");
        printGraph(adjacencyMatrix, numVertices);
    }

    static void printGraph(int[][] matrix, int numVertices) {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
Pada contoh di atas, kita menggunakan matriks ketetanggan untuk merepresentasikan graph terarah dengan empat simpul (A, B, C, D). Nilai 1 di baris i dan kolom j menunjukkan adanya sisi dari simpul i ke simpul j. Output dari program ini akan menampilkan matriks ketetanggan yang merepresentasikan graph terarah. Pastikan Anda memahami bahwa ini hanyalah salah satu cara merepresentasikan graph dan masih banyak cara lain yang dapat digunakan tergantung pada kebutuhan spesifik dari aplikasi Anda.

- Graph Berbobot (Weighted Graph): Setiap sisi memiliki nilai atau bobot yang menyatakan seberapa penting atau berat hubungan antara dua simpul.
  contoh kodingan Java
  import java.util.*;

public class WeightedGraphExample {

    public static void main(String[] args) {
        int numVertices = 4;
        int[][] weightedAdjacencyMatrix = {
            {0, 2, 0, 4},
            {0, 0, 1, 0},
            {0, 0, 0, 3},
            {0, 0, 0, 0}
        };

        System.out.println("Weighted Graph Representation using Adjacency Matrix:");
        printWeightedGraph(weightedAdjacencyMatrix, numVertices);
    }

    static void printWeightedGraph(int[][] matrix, int numVertices) {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
Pada contoh ini, kita menggunakan matriks ketetanggan untuk merepresentasikan graph berbobot dengan empat simpul (A, B, C, D). Nilai pada matriks menunjukkan bobot dari sisi yang menghubungkan simpul-simpul tersebut. Output dari program ini akan menampilkan matriks ketetanggan yang merepresentasikan graph berbobot.

Representasi Graph
Graph dapat direpresentasikan menggunakan beberapa metode, tergantung pada kebutuhan dan jenis operasi yang ingin dilakukan. Beberapa metode umum untuk merepresentasikan graph adalah:
- Matriks Ketetanggan (Adjacency Matrix): Matriks dua dimensi digunakan untuk menyimpan informasi keterhubungan antar simpul. Baris dan kolom mewakili simpul-simpul, dan nilai di posisi (i, j) menunjukkan apakah ada sisi yang menghubungkan simpul i dan simpul j.
  int[][] adjacencyMatrix = {
    {0, 1, 1, 0},
    {1, 0, 0, 1},
    {1, 0, 0, 1},
    {0, 1, 1, 0}
};
- Daftar Ketetanggan (Adjacency List): Setiap simpul memiliki daftar simpul-simpul yang terhubung langsung dengannya. Ini biasanya diimplementasikan menggunakan struktur data seperti ArrayList atau LinkedList.
  List<List<Integer>> adjacencyList = new ArrayList<>();

adjacencyList.add(Arrays.asList(1, 2));
adjacencyList.add(Arrays.asList(0, 3));
adjacencyList.add(Arrays.asList(0, 3));
adjacencyList.add(Arrays.asList(1, 2));

- Matriks Berbobot (Weighted Matrix): Matriks ketetanggan diubah menjadi matriks berbobot dengan menyertakan nilai bobot pada sisi-sisi yang menghubungkan simpul-simpul.
  int[][] weightedMatrix = {
    {0, 2, 0, 4},
    {0, 0, 1, 0},
    {0, 0, 0, 3},
    {0, 0, 0, 0}
};
- Daftar Berbobot (Weighted List): Daftar ketetanggan diubah dengan menyertakan nilai bobot pada setiap sisi.
  List<List<Pair<Integer, Integer>>> weightedList = new ArrayList<>();

weightedList.add(Arrays.asList(new Pair<>(1, 2), new Pair<>(2, 4)));
weightedList.add(Collections.singletonList(new Pair<>(3, 1)));
weightedList.add(Collections.singletonList(new Pair<>(3, 3)));
weightedList.add(Collections.emptyList());

Setiap metode memiliki kelebihan dan kekurangan tergantung pada operasi yang akan dilakukan pada graph. Matriks ketetanggan baik untuk mencari keterhubungan secara cepat, tetapi membutuhkan lebih banyak ruang jika graph besar dan sebagian besar simpul tidak terhubung. Daftar ketetanggan lebih efisien untuk menyimpan graph jarang (graph dengan sedikit sisi), sedangkan matriks berbobot berguna ketika graph memiliki bobot pada sisi-sisinya. Pilihan representasi tergantung pada skenario penggunaan dan persyaratan aplikasi.


   

