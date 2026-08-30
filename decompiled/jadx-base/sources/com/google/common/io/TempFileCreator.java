package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
abstract class TempFileCreator {
    static final com.google.common.io.TempFileCreator INSTANCE = pickSecureCreator();

    abstract java.io.File createTempDir();

    abstract java.io.File createTempFile(java.lang.String prefix) throws java.io.IOException;

    private static com.google.common.io.TempFileCreator pickSecureCreator() {
        try {
            try {
                java.lang.Class.forName("java.nio.file.Path");
                return new com.google.common.io.TempFileCreator.JavaNioCreator();
            } catch (java.lang.ClassNotFoundException unused) {
                if (((java.lang.Integer) java.lang.Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue() < ((java.lang.Integer) java.lang.Class.forName("android.os.Build$VERSION_CODES").getField("JELLY_BEAN").get(null)).intValue()) {
                    return new com.google.common.io.TempFileCreator.ThrowingCreator();
                }
                return new com.google.common.io.TempFileCreator.JavaIoCreator();
            }
        } catch (java.lang.ClassNotFoundException unused2) {
            return new com.google.common.io.TempFileCreator.ThrowingCreator();
        } catch (java.lang.IllegalAccessException unused3) {
            return new com.google.common.io.TempFileCreator.ThrowingCreator();
        } catch (java.lang.NoSuchFieldException unused4) {
            return new com.google.common.io.TempFileCreator.ThrowingCreator();
        }
    }

    static void testMakingUserPermissionsFromScratch() throws java.io.IOException {
        com.google.common.io.TempFileCreator.JavaNioCreator.userPermissions().get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class JavaNioCreator extends com.google.common.io.TempFileCreator {
        private static final com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier directoryPermissions;
        private static final com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier filePermissions;

        /* JADX INFO: Access modifiers changed from: private */
        interface PermissionSupplier {
            java.nio.file.attribute.FileAttribute<?> get() throws java.io.IOException;
        }

        static /* synthetic */ java.nio.file.attribute.FileAttribute lambda$userPermissions$3(java.nio.file.attribute.FileAttribute fileAttribute) throws java.io.IOException {
            return fileAttribute;
        }

        private JavaNioCreator() {
            super();
        }

        @Override // com.google.common.io.TempFileCreator
        java.io.File createTempDir() {
            try {
                return java.nio.file.Files.createTempDirectory(java.nio.file.Paths.get(com.google.common.base.StandardSystemProperty.JAVA_IO_TMPDIR.value(), new java.lang.String[0]), null, directoryPermissions.get()).toFile();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException("Failed to create directory", e);
            }
        }

        @Override // com.google.common.io.TempFileCreator
        java.io.File createTempFile(java.lang.String prefix) throws java.io.IOException {
            return java.nio.file.Files.createTempFile(java.nio.file.Paths.get(com.google.common.base.StandardSystemProperty.JAVA_IO_TMPDIR.value(), new java.lang.String[0]), prefix, null, filePermissions.get()).toFile();
        }

        static {
            java.util.Set<java.lang.String> setSupportedFileAttributeViews = java.nio.file.FileSystems.getDefault().supportedFileAttributeViews();
            if (setSupportedFileAttributeViews.contains("posix")) {
                filePermissions = new com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier() { // from class: com.google.common.io.TempFileCreator$JavaNioCreator$$ExternalSyntheticLambda0
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final java.nio.file.attribute.FileAttribute get() {
                        return java.nio.file.attribute.PosixFilePermissions.asFileAttribute(java.nio.file.attribute.PosixFilePermissions.fromString("rw-------"));
                    }
                };
                directoryPermissions = new com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier() { // from class: com.google.common.io.TempFileCreator$JavaNioCreator$$ExternalSyntheticLambda1
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final java.nio.file.attribute.FileAttribute get() {
                        return java.nio.file.attribute.PosixFilePermissions.asFileAttribute(java.nio.file.attribute.PosixFilePermissions.fromString("rwx------"));
                    }
                };
            } else if (setSupportedFileAttributeViews.contains("acl")) {
                com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplierUserPermissions = userPermissions();
                directoryPermissions = permissionSupplierUserPermissions;
                filePermissions = permissionSupplierUserPermissions;
            } else {
                com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplier = new com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier() { // from class: com.google.common.io.TempFileCreator$JavaNioCreator$$ExternalSyntheticLambda2
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final java.nio.file.attribute.FileAttribute get() {
                        return com.google.common.io.TempFileCreator.JavaNioCreator.lambda$static$2();
                    }
                };
                directoryPermissions = permissionSupplier;
                filePermissions = permissionSupplier;
            }
        }

        static /* synthetic */ java.nio.file.attribute.FileAttribute lambda$static$2() throws java.io.IOException {
            throw new java.io.IOException("unrecognized FileSystem type " + java.nio.file.FileSystems.getDefault());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier userPermissions() {
            try {
                final com.google.common.collect.ImmutableList immutableListOf = com.google.common.collect.ImmutableList.of(java.nio.file.attribute.AclEntry.newBuilder().setType(java.nio.file.attribute.AclEntryType.ALLOW).setPrincipal(java.nio.file.FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName(getUsername())).setPermissions(java.util.EnumSet.allOf(java.nio.file.attribute.AclEntryPermission.class)).setFlags(java.nio.file.attribute.AclEntryFlag.DIRECTORY_INHERIT, java.nio.file.attribute.AclEntryFlag.FILE_INHERIT).build());
                final java.nio.file.attribute.FileAttribute<com.google.common.collect.ImmutableList<java.nio.file.attribute.AclEntry>> fileAttribute = new java.nio.file.attribute.FileAttribute<com.google.common.collect.ImmutableList<java.nio.file.attribute.AclEntry>>() { // from class: com.google.common.io.TempFileCreator.JavaNioCreator.1
                    @Override // java.nio.file.attribute.FileAttribute
                    public java.lang.String name() {
                        return "acl:acl";
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.nio.file.attribute.FileAttribute
                    public com.google.common.collect.ImmutableList<java.nio.file.attribute.AclEntry> value() {
                        return immutableListOf;
                    }
                };
                return new com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier() { // from class: com.google.common.io.TempFileCreator$JavaNioCreator$$ExternalSyntheticLambda3
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final java.nio.file.attribute.FileAttribute get() {
                        return com.google.common.io.TempFileCreator.JavaNioCreator.lambda$userPermissions$3(fileAttribute);
                    }
                };
            } catch (java.io.IOException e) {
                return new com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier() { // from class: com.google.common.io.TempFileCreator$JavaNioCreator$$ExternalSyntheticLambda4
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final java.nio.file.attribute.FileAttribute get() {
                        return com.google.common.io.TempFileCreator.JavaNioCreator.lambda$userPermissions$4(e);
                    }
                };
            }
        }

        static /* synthetic */ java.nio.file.attribute.FileAttribute lambda$userPermissions$4(java.io.IOException iOException) throws java.io.IOException {
            throw new java.io.IOException("Could not find user", iOException);
        }

        private static java.lang.String getUsername() {
            java.lang.String str = (java.lang.String) java.util.Objects.requireNonNull(com.google.common.base.StandardSystemProperty.USER_NAME.value());
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("java.lang.ProcessHandle");
                java.lang.Class<?> cls2 = java.lang.Class.forName("java.lang.ProcessHandle$Info");
                java.lang.Class<?> cls3 = java.lang.Class.forName("java.util.Optional");
                java.lang.reflect.Method method = cls.getMethod("current", new java.lang.Class[0]);
                java.lang.reflect.Method method2 = cls.getMethod("info", new java.lang.Class[0]);
                return (java.lang.String) java.util.Objects.requireNonNull(cls3.getMethod("orElse", java.lang.Object.class).invoke(cls2.getMethod("user", new java.lang.Class[0]).invoke(method2.invoke(method.invoke(null, new java.lang.Object[0]), new java.lang.Object[0]), new java.lang.Object[0]), str));
            } catch (java.lang.ClassNotFoundException unused) {
                return str;
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException unused2) {
                return str;
            } catch (java.lang.reflect.InvocationTargetException e) {
                com.google.common.base.Throwables.throwIfUnchecked(e.getCause());
                return str;
            }
        }
    }

    private static final class JavaIoCreator extends com.google.common.io.TempFileCreator {
        private static final int TEMP_DIR_ATTEMPTS = 10000;

        private JavaIoCreator() {
            super();
        }

        @Override // com.google.common.io.TempFileCreator
        java.io.File createTempDir() {
            java.io.File file = new java.io.File(com.google.common.base.StandardSystemProperty.JAVA_IO_TMPDIR.value());
            java.lang.String str = java.lang.System.currentTimeMillis() + "-";
            for (int i = 0; i < 10000; i++) {
                java.io.File file2 = new java.io.File(file, str + i);
                if (file2.mkdir()) {
                    return file2;
                }
            }
            throw new java.lang.IllegalStateException("Failed to create directory within 10000 attempts (tried " + str + "0 to " + str + "9999)");
        }

        @Override // com.google.common.io.TempFileCreator
        java.io.File createTempFile(java.lang.String prefix) throws java.io.IOException {
            return java.io.File.createTempFile(prefix, null, null);
        }
    }

    private static final class ThrowingCreator extends com.google.common.io.TempFileCreator {
        private static final java.lang.String MESSAGE = "Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().";

        private ThrowingCreator() {
            super();
        }

        @Override // com.google.common.io.TempFileCreator
        java.io.File createTempDir() {
            throw new java.lang.IllegalStateException(MESSAGE);
        }

        @Override // com.google.common.io.TempFileCreator
        java.io.File createTempFile(java.lang.String prefix) throws java.io.IOException {
            throw new java.io.IOException(MESSAGE);
        }
    }

    private TempFileCreator() {
    }
}
