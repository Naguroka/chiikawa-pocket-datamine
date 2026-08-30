package com.google.android.material.color;

/* JADX INFO: loaded from: classes5.dex */
final class ColorResourcesLoaderCreator {
    private static final java.lang.String TAG = "ColorResourcesLoaderCreator";

    private ColorResourcesLoaderCreator() {
    }

    static android.content.res.loader.ResourcesLoader create(android.content.Context context, java.util.Map<java.lang.Integer, java.lang.Integer> map) throws java.lang.Throwable {
        java.io.FileDescriptor fileDescriptorMemfd_create;
        try {
            byte[] bArrCreate = com.google.android.material.color.ColorResourcesTableCreator.create(context, map);
            android.util.Log.i(TAG, "Table created, length: " + bArrCreate.length);
            if (bArrCreate.length == 0) {
                return null;
            }
            try {
                fileDescriptorMemfd_create = android.system.Os.memfd_create("temp.arsc", 0);
                try {
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileDescriptorMemfd_create);
                    try {
                        fileOutputStream.write(bArrCreate);
                        android.os.ParcelFileDescriptor parcelFileDescriptorDup = android.os.ParcelFileDescriptor.dup(fileDescriptorMemfd_create);
                        try {
                            android.content.res.loader.ResourcesLoader resourcesLoader = new android.content.res.loader.ResourcesLoader();
                            resourcesLoader.addProvider(android.content.res.loader.ResourcesProvider.loadFromTable(parcelFileDescriptorDup, null));
                            if (parcelFileDescriptorDup != null) {
                                parcelFileDescriptorDup.close();
                            }
                            fileOutputStream.close();
                            if (fileDescriptorMemfd_create != null) {
                                android.system.Os.close(fileDescriptorMemfd_create);
                            }
                            return resourcesLoader;
                        } catch (java.lang.Throwable th) {
                            if (parcelFileDescriptorDup != null) {
                                try {
                                    parcelFileDescriptorDup.close();
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th3) {
                        try {
                            fileOutputStream.close();
                        } catch (java.lang.Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    if (fileDescriptorMemfd_create != null) {
                        android.system.Os.close(fileDescriptorMemfd_create);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                fileDescriptorMemfd_create = null;
            }
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG, "Failed to create the ColorResourcesTableCreator.", e);
            return null;
        }
    }
}
