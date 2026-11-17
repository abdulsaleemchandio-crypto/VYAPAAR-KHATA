# موبائل تان APK ٺاهڻ جي رهنمائي

هي طريقو GitHub Actions جي cloud build استعمال ڪري ٿو؛ ڪمپيوٽر لازمي نه آهي، پر انٽرنيٽ ۽ GitHub اڪائونٽ گهرجي.

1. GitHub تي پنهنجو اڪائونٽ کوليو يا ٺاهيو.
2. نئون Public يا Private repository ٺاهيو، مثال طور `vyapaar-khata`.
3. ZIP کي فون ۾ Extract ڪريو.
4. GitHub جي repository ۾ `Add file` → `Upload files` ذريعي Extract ٿيل پروجيڪٽ جا سڀ فولڊر ۽ فائيل اپلوڊ ڪريو. `.github/workflows/build-apk.yml` به لازمي اپلوڊ ٿئي.
5. اپلوڊ کان پوءِ `Actions` ٽيب کوليو. `Build Vyapaar Khata APK` workflow چونڊيو.
6. `Run workflow` دٻايو، يا `main` تي فائيل اپلوڊ ٿيڻ کان پوءِ پاڻمرادو هلڻ ڏيو.
7. Build ڪامياب ٿيڻ تي run کوليو، `Artifacts` مان `vyapaar-khata-debug-apk` ڊائونلوڊ ڪريو ۽ ZIP کوليو. اندر `app-debug.apk` هوندو.

نوٽ:
- هي Debug APK صرف ابتدائي جاچ لاءِ آهي، Play Store تي اپلوڊ ڪرڻ لاءِ Release AAB ۽ محفوظ signing الڳ تيار ڪرڻي پوندي.
- هن موجوده ورزن ۾ اسڪرين ۽ بنيادي ڊيٽا ماڊل جو خاڪو آهي؛ ان کي اڃا مڪمل حساب ڪتاب واري ايپ نه سمجهو.
- GitHub اڪائونٽ/Actions جي موجوده حدن ۽ Android فون جي فائيل مئنيجر موجب بٽڻن جا نالا ٿورا مختلف ٿي سگهن ٿا.
- پنهنجو GitHub پاسورڊ، OTP يا recovery code ڪنهن سان به شيئر نه ڪريو.
