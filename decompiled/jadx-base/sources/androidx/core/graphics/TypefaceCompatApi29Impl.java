package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompatApi29Impl extends androidx.core.graphics.TypefaceCompatBaseImpl {
    private static int getMatchScore(android.graphics.fonts.FontStyle fontStyle, android.graphics.fonts.FontStyle fontStyle2) {
        return (java.lang.Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    private android.graphics.fonts.Font findBaseFont(android.graphics.fonts.FontFamily fontFamily, int i) {
        android.graphics.fonts.FontStyle fontStyle = new android.graphics.fonts.FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        android.graphics.fonts.Font font = fontFamily.getFont(0);
        int matchScore = getMatchScore(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            android.graphics.fonts.Font font2 = fontFamily.getFont(i2);
            int matchScore2 = getMatchScore(fontStyle, font2.getStyle());
            if (matchScore2 < matchScore) {
                font = font2;
                matchScore = matchScore2;
            }
        }
        return font;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    protected androidx.core.provider.FontsContractCompat.FontInfo findBestInfo(androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        throw new java.lang.RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    protected android.graphics.Typeface createFromInputStream(android.content.Context context, java.io.InputStream inputStream) {
        throw new java.lang.RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b A[Catch: IOException -> 0x0060, Exception -> 0x0080, PHI: r4
  0x001b: PHI (r4v5 android.graphics.fonts.FontFamily$Builder) = (r4v3 android.graphics.fonts.FontFamily$Builder), (r4v1 android.graphics.fonts.FontFamily$Builder) binds: [B:19:0x0051, B:8:0x0019] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x0080, blocks: (B:3:0x0005, B:5:0x000b, B:6:0x000d, B:9:0x001b, B:27:0x005f, B:26:0x005c, B:31:0x0066), top: B:35:0x0005 }] */
    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context context, android.os.CancellationSignal cancellationSignal, androidx.core.provider.FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        android.content.ContentResolver contentResolver = context.getContentResolver();
        try {
            android.graphics.fonts.FontFamily.Builder builder = null;
            for (androidx.core.provider.FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
                try {
                    android.os.ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(fontInfo.getUri(), com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, cancellationSignal);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            android.graphics.fonts.Font fontBuild = new android.graphics.fonts.Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(fontInfo.getWeight()).setSlant(fontInfo.isItalic() ? 1 : 0).setTtcIndex(fontInfo.getTtcIndex()).build();
                            if (builder == null) {
                                builder = new android.graphics.fonts.FontFamily.Builder(fontBuild);
                            } else {
                                builder.addFont(fontBuild);
                            }
                            if (parcelFileDescriptorOpenFileDescriptor != null) {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            }
                        } catch (java.lang.Throwable th) {
                            if (parcelFileDescriptorOpenFileDescriptor != null) {
                                try {
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } else if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                } catch (java.io.IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            android.graphics.fonts.FontFamily fontFamilyBuild = builder.build();
            return new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(findBaseFont(fontFamilyBuild, i).getStyle()).build();
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context context, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, android.content.res.Resources resources, int i) {
        try {
            android.graphics.fonts.FontFamily.Builder builder = null;
            for (androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.getEntries()) {
                try {
                    android.graphics.fonts.Font fontBuild = new android.graphics.fonts.Font.Builder(resources, fontFileResourceEntry.getResourceId()).setWeight(fontFileResourceEntry.getWeight()).setSlant(fontFileResourceEntry.isItalic() ? 1 : 0).setTtcIndex(fontFileResourceEntry.getTtcIndex()).setFontVariationSettings(fontFileResourceEntry.getVariationSettings()).build();
                    if (builder == null) {
                        builder = new android.graphics.fonts.FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (java.io.IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            android.graphics.fonts.FontFamily fontFamilyBuild = builder.build();
            return new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(findBaseFont(fontFamilyBuild, i).getStyle()).build();
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromResourcesFontFile(android.content.Context context, android.content.res.Resources resources, int i, java.lang.String str, int i2) {
        try {
            android.graphics.fonts.Font fontBuild = new android.graphics.fonts.Font.Builder(resources, i).build();
            return new android.graphics.Typeface.CustomFallbackBuilder(new android.graphics.fonts.FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    android.graphics.Typeface createWeightStyle(android.content.Context context, android.graphics.Typeface typeface, int i, boolean z) {
        return android.graphics.Typeface.create(typeface, i, z);
    }
}
