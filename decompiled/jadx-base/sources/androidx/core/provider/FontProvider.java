package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
class FontProvider {
    private static final java.util.Comparator<byte[]> sByteArrayComparator = new java.util.Comparator() { // from class: androidx.core.provider.FontProvider$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return androidx.core.provider.FontProvider.lambda$static$0((byte[]) obj, (byte[]) obj2);
        }
    };

    private FontProvider() {
    }

    static androidx.core.provider.FontsContractCompat.FontFamilyResult getFontFamilyResult(android.content.Context context, androidx.core.provider.FontRequest fontRequest, android.os.CancellationSignal cancellationSignal) throws android.content.pm.PackageManager.NameNotFoundException {
        android.content.pm.ProviderInfo provider = getProvider(context.getPackageManager(), fontRequest, context.getResources());
        if (provider == null) {
            return androidx.core.provider.FontsContractCompat.FontFamilyResult.create(1, null);
        }
        return androidx.core.provider.FontsContractCompat.FontFamilyResult.create(0, query(context, fontRequest, provider.authority, cancellationSignal));
    }

    static android.content.pm.ProviderInfo getProvider(android.content.pm.PackageManager packageManager, androidx.core.provider.FontRequest fontRequest, android.content.res.Resources resources) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String providerAuthority = fontRequest.getProviderAuthority();
        android.content.pm.ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(providerAuthority, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new android.content.pm.PackageManager.NameNotFoundException("No package found for authority: " + providerAuthority);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(fontRequest.getProviderPackage())) {
            throw new android.content.pm.PackageManager.NameNotFoundException("Found content provider " + providerAuthority + ", but package was not " + fontRequest.getProviderPackage());
        }
        java.util.List<byte[]> listConvertToByteArrayList = convertToByteArrayList(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        java.util.Collections.sort(listConvertToByteArrayList, sByteArrayComparator);
        java.util.List<java.util.List<byte[]>> certificates = getCertificates(fontRequest, resources);
        for (int i = 0; i < certificates.size(); i++) {
            java.util.ArrayList arrayList = new java.util.ArrayList(certificates.get(i));
            java.util.Collections.sort(arrayList, sByteArrayComparator);
            if (equalsByteArrayList(listConvertToByteArrayList, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    static androidx.core.provider.FontsContractCompat.FontInfo[] query(android.content.Context context, androidx.core.provider.FontRequest fontRequest, java.lang.String str, android.os.CancellationSignal cancellationSignal) {
        android.net.Uri uriWithAppendedId;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.net.Uri uriBuild = new android.net.Uri.Builder().scheme("content").authority(str).build();
        android.net.Uri uriBuild2 = new android.net.Uri.Builder().scheme("content").authority(str).appendPath(com.ironsource.y8.h.b).build();
        android.database.Cursor cursorQuery = null;
        try {
            int i = 0;
            cursorQuery = androidx.core.provider.FontProvider.Api16Impl.query(context.getContentResolver(), uriBuild, new java.lang.String[]{"_id", androidx.core.provider.FontsContractCompat.Columns.FILE_ID, androidx.core.provider.FontsContractCompat.Columns.TTC_INDEX, androidx.core.provider.FontsContractCompat.Columns.VARIATION_SETTINGS, androidx.core.provider.FontsContractCompat.Columns.WEIGHT, androidx.core.provider.FontsContractCompat.Columns.ITALIC, androidx.core.provider.FontsContractCompat.Columns.RESULT_CODE}, "query = ?", new java.lang.String[]{fontRequest.getQuery()}, null, cancellationSignal);
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.RESULT_CODE);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int columnIndex2 = cursorQuery.getColumnIndex("_id");
                int columnIndex3 = cursorQuery.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.FILE_ID);
                int columnIndex4 = cursorQuery.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.TTC_INDEX);
                int columnIndex5 = cursorQuery.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.WEIGHT);
                int columnIndex6 = cursorQuery.getColumnIndex(androidx.core.provider.FontsContractCompat.Columns.ITALIC);
                while (cursorQuery.moveToNext()) {
                    int i2 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : i;
                    int i3 = columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : i;
                    if (columnIndex3 == -1) {
                        uriWithAppendedId = android.content.ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2));
                    } else {
                        uriWithAppendedId = android.content.ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3));
                    }
                    arrayList2.add(androidx.core.provider.FontsContractCompat.FontInfo.create(uriWithAppendedId, i3, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i2));
                    i = 0;
                }
                arrayList = arrayList2;
            }
            return (androidx.core.provider.FontsContractCompat.FontInfo[]) arrayList.toArray(new androidx.core.provider.FontsContractCompat.FontInfo[0]);
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    private static java.util.List<java.util.List<byte[]>> getCertificates(androidx.core.provider.FontRequest fontRequest, android.content.res.Resources resources) {
        if (fontRequest.getCertificates() != null) {
            return fontRequest.getCertificates();
        }
        return androidx.core.content.res.FontResourcesParserCompat.readCerts(resources, fontRequest.getCertificatesArrayResId());
    }

    static /* synthetic */ int lambda$static$0(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    private static boolean equalsByteArrayList(java.util.List<byte[]> list, java.util.List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!java.util.Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static java.util.List<byte[]> convertToByteArrayList(android.content.pm.Signature[] signatureArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.content.pm.Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static android.database.Cursor query(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2, java.lang.Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (android.os.CancellationSignal) obj);
        }
    }
}
