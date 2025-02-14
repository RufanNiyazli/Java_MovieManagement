# Film İdarəetmə Sistemi

Bu, konsol üzərindən işləyən sadə bir Java tətbiqidir. İstifadəçilər film əlavə edə, axtara və silə bilərlər.

## Xüsusiyyətlər
- **Film Əlavə Etmək**: İstifadəçilər film əlavə edə bilər. Hər filmə unikal ID, ad, rejissor, janr və reytinq təyin olunur.
- **Film Axtarmaq**: Filmləri ad, rejissor və ya janra görə axtarmaq mümkündür.
- **Film Silmək**: Filmi adı və ya ID-si ilə silmək mümkündür.
- **Çıxış**: Proqramdan çıxış etmək imkanı.

## Layihə Qovluq Strukturu
```
MovieManagement/
├── src/
│   ├── Main.java
│   ├── Film/
│   │   ├── Movie.java
│   │   ├── MovieManager.java
```

## Quraşdırma və İşə Salma
1. Repozitoriyanı klonlayın:
   ```sh
   git clone https://github.com/RufanNiyazli/Java_MovieManagement
   
   ```
2. Layihə qovluğuna keçin:
   ```sh
   cd MovieManagement
   ```
3. Layihəni tərtib edin:
   ```sh
   javac -d . src/*.java
   ```
4. Proqramı işə salın:
   ```sh
   java Main
   ```

## Kod İzahlı Dərs
### 1. Main.java
Bu fayl əsas giriş nöqtəsidir. **Main** sinfi istifadəçidən məlumatları alır və **MovieManager** sinfi vasitəsilə işləyir.
#### Əsas hissələr:
- **Scanner scanner = new Scanner(System.in);** – İstifadəçidən giriş məlumatları almaq üçün istifadə olunur.
- **MovieManager movieManager = new MovieManager();** – Film idarəetmə obyektini yaradır.
- **while (flag) {...}** – Menyu sistemi ilə proqram işləyir.
- **switch (btn) {...}** – Seçimlərə görə əməliyyatları icra edir.

### 2. Movie.java
Bu sinif hər bir film üçün obyekt yaratmaq məqsədilə istifadə olunur.
#### Əsas hissələr:
- **private int movieId;** – Filmin unikal ID-si.
- **private String movieName;** – Filmin adı.
- **private String directorName;** – Rejissorun adı.
- **private String genre;** – Filmin janrı.
- **private double rating;** – Filmin reytinqi.
- **public String toString() {...}** – Filmin məlumatlarını formatlı şəkildə qaytarır.

### 3. MovieManager.java
Bu sinif filmlərin siyahısını idarə edir.
#### Əsas hissələr:
- **private List<Movie> movies;** – Bütün filmləri saxlayan siyahıdır.
- **public void movieAdd(Movie movie) {...}** – Yeni film əlavə edir.
- **public List<Movie> searchMovie(String searchMovie) {...}** – Filmi axtarır.
- **public void deleteMovie(String deleteMovie) {...}** – Filmi adı və ya ID-si ilə siyahıdan silir.

## İstifadə Qaydası
Proqram başladıqda aşağıdakı menyu çıxır:
```
Welcome, Sir.
Add Movie-->1 : Search Movie-->2 : Delete Movie-->3 : Exit --->4
```
### 1. Film Əlavə Etmək
- Məlumatları daxil edərək yeni film əlavə edin.
- Unikal ID avtomatik olaraq təyin edilir.

### 2. Film Axtarmaq
- Ad, rejissor və ya janra görə film axtarın.
- Tapılan nəticələr ekrana çap olunur.

### 3. Film Silmək
- Filmin adını və ya ID-sini daxil edərək silin.

### 4. Çıxış
- Proqram bağlanır.

## Nümunə İcra
```
Welcome, Sir.
Add Movie-->1 : Search Movie-->2 : Delete movie-->3 : Exit --->4
1
Movie id will be: 23
Enter name of the movie: Inception
Enter movie's director: Christopher Nolan
Enter movie's genre: Sci-Fi
Enter movie's rating: 8.8
Inception Successfully added.
```

## Asılılıqlar
- Java 8+

## Lisenziya
Bu layihə açıq mənbəlidir və hər kəs tərəfindən istifadə və dəyişdirilə bilər.

