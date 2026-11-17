# Vyapaar Khata — Android Starter v0.1.0

هي Android Studio لاءِ شروعاتي سورس پروجيڪٽ آهي، APK نه آهي.

## شامل
- Kotlin + Jetpack Compose شروعاتي اسڪرين
- Dashboard ۽ ماڊيولن جي نيويگيشن جو خاڪو
- Room/SQLite لاءِ شروعاتي ڊيٽا ماڊل
- Multi-currency ٽرانزيڪشن ۽ هر ٽرانزيڪشن سان exchange rate محفوظ ڪرڻ
- بنيادي حساب ڪتاب جا فنڪشن

## فني اصول
- هر ڪاروبار پنهنجي Base Currency چونڊيندو؛ شروعاتي تجويز PKR.
- هر ٽرانزيڪشن پنهنجي ڪرنسي ۽ ان وقت جو مٽاسٽا ريٽ محفوظ ڪندي.
- پراڻن ٽرانزيڪشن جا ريٽ تبديل نه ٿيندا.
- Customer Ledger لازمي نه هوندو.
- آف لائن ڊيٽا فون ۾ رهندي؛ آن لائن بيڪ اپ اختياري هوندو.

## اڃا مڪمل ڪرڻا ڪم
Room DAO/Database، خريد ۽ وڪري جا فارم، اسٽاڪ ۽ منافعو جا مڪمل حساب، import/export backup، سنڌي/اردو/انگريزي ترجما، ٽيسٽنگ، رازداري پاليسي، AdMob ۽ Play Store release configuration.

## Build
Android Studio ۾ هي فولڊر کوليو ۽ Gradle Sync ڪريو. هي ZIP پاڻمرادو انسٽال ٿيندڙ APK ناهي؛ APK/AAB ٺاهڻ لاءِ Android build environment ۽ signing ضروري آهن.
