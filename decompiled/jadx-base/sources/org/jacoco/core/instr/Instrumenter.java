package org.jacoco.core.instr;

/* JADX INFO: loaded from: classes6.dex */
public class Instrumenter {
    private final org.jacoco.core.runtime.IExecutionDataAccessorGenerator accessorGenerator;
    private final org.jacoco.core.internal.instr.SignatureRemover signatureRemover = new org.jacoco.core.internal.instr.SignatureRemover();

    public Instrumenter(org.jacoco.core.runtime.IExecutionDataAccessorGenerator iExecutionDataAccessorGenerator) {
        this.accessorGenerator = iExecutionDataAccessorGenerator;
    }

    public void setRemoveSignatures(boolean z) {
        this.signatureRemover.setActive(z);
    }

    private byte[] instrument(byte[] bArr) {
        long jClassId = org.jacoco.core.internal.data.CRC64.classId(bArr);
        org.objectweb.asm.ClassReader classReaderClassReaderFor = org.jacoco.core.internal.instr.InstrSupport.classReaderFor(bArr);
        org.objectweb.asm.ClassWriter classWriter = new org.objectweb.asm.ClassWriter(classReaderClassReaderFor, 0) { // from class: org.jacoco.core.instr.Instrumenter.1
            @Override // org.objectweb.asm.ClassWriter
            protected java.lang.String getCommonSuperClass(java.lang.String str, java.lang.String str2) {
                throw new java.lang.IllegalStateException();
            }
        };
        classReaderClassReaderFor.accept(new org.jacoco.core.internal.flow.ClassProbesAdapter(new org.jacoco.core.internal.instr.ClassInstrumenter(org.jacoco.core.internal.instr.ProbeArrayStrategyFactory.createFor(jClassId, classReaderClassReaderFor, this.accessorGenerator), classWriter), org.jacoco.core.internal.instr.InstrSupport.needsFrames(org.jacoco.core.internal.instr.InstrSupport.getMajorVersion(classReaderClassReaderFor))), 8);
        return classWriter.toByteArray();
    }

    public byte[] instrument(byte[] bArr, java.lang.String str) throws java.io.IOException {
        try {
            return instrument(bArr);
        } catch (java.lang.RuntimeException e) {
            throw instrumentError(str, e);
        }
    }

    public byte[] instrument(java.io.InputStream inputStream, java.lang.String str) throws java.io.IOException {
        try {
            return instrument(org.jacoco.core.internal.InputStreams.readFully(inputStream), str);
        } catch (java.io.IOException e) {
            throw instrumentError(str, e);
        }
    }

    public void instrument(java.io.InputStream inputStream, java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        outputStream.write(instrument(inputStream, str));
    }

    private java.io.IOException instrumentError(java.lang.String str, java.lang.Exception exc) {
        java.io.IOException iOException = new java.io.IOException(java.lang.String.format("Error while instrumenting %s with JaCoCo %s/%s.", str, org.jacoco.core.JaCoCo.VERSION, org.jacoco.core.JaCoCo.COMMITID_SHORT));
        iOException.initCause(exc);
        return iOException;
    }

    public int instrumentAll(java.io.InputStream inputStream, java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        try {
            org.jacoco.core.internal.ContentTypeDetector contentTypeDetector = new org.jacoco.core.internal.ContentTypeDetector(inputStream);
            int type = contentTypeDetector.getType();
            if (type == -889275714) {
                instrument(contentTypeDetector.getInputStream(), outputStream, str);
                return 1;
            }
            if (type == -889270259) {
                return instrumentPack200(contentTypeDetector.getInputStream(), outputStream, str);
            }
            if (type == 529203200) {
                return instrumentGzip(contentTypeDetector.getInputStream(), outputStream, str);
            }
            if (type == 1347093252) {
                return instrumentZip(contentTypeDetector.getInputStream(), outputStream, str);
            }
            copy(contentTypeDetector.getInputStream(), outputStream, str);
            return 0;
        } catch (java.io.IOException e) {
            throw instrumentError(str, e);
        }
    }

    private int instrumentZip(java.io.InputStream inputStream, java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(inputStream);
        java.util.zip.ZipOutputStream zipOutputStream = new java.util.zip.ZipOutputStream(outputStream);
        int iFilterOrInstrument = 0;
        while (true) {
            java.util.zip.ZipEntry zipEntryNextEntry = nextEntry(zipInputStream, str);
            if (zipEntryNextEntry != null) {
                java.lang.String name = zipEntryNextEntry.getName();
                if (!this.signatureRemover.removeEntry(name)) {
                    java.util.zip.ZipEntry zipEntry = new java.util.zip.ZipEntry(name);
                    zipEntry.setMethod(zipEntryNextEntry.getMethod());
                    int method = zipEntryNextEntry.getMethod();
                    if (method == 0) {
                        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                        iFilterOrInstrument += filterOrInstrument(zipInputStream, byteArrayOutputStream, str, name);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        zipEntry.setSize(byteArray.length);
                        zipEntry.setCompressedSize(byteArray.length);
                        zipEntry.setCrc(crc(byteArray));
                        zipOutputStream.putNextEntry(zipEntry);
                        zipOutputStream.write(byteArray);
                    } else if (method == 8) {
                        zipOutputStream.putNextEntry(zipEntry);
                        iFilterOrInstrument += filterOrInstrument(zipInputStream, zipOutputStream, str, name);
                    } else {
                        throw new java.lang.AssertionError(zipEntryNextEntry.getMethod());
                    }
                    zipOutputStream.closeEntry();
                }
            } else {
                zipOutputStream.finish();
                return iFilterOrInstrument;
            }
        }
    }

    private int filterOrInstrument(java.io.InputStream inputStream, java.io.OutputStream outputStream, java.lang.String str, java.lang.String str2) throws java.io.IOException {
        if (this.signatureRemover.filterEntry(str2, inputStream, outputStream)) {
            return 0;
        }
        return instrumentAll(inputStream, outputStream, str + "@" + str2);
    }

    private static long crc(byte[] bArr) {
        java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
        crc32.update(bArr);
        return crc32.getValue();
    }

    private java.util.zip.ZipEntry nextEntry(java.util.zip.ZipInputStream zipInputStream, java.lang.String str) throws java.io.IOException {
        try {
            return zipInputStream.getNextEntry();
        } catch (java.io.IOException e) {
            throw instrumentError(str, e);
        }
    }

    private int instrumentGzip(java.io.InputStream inputStream, java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        try {
            java.io.InputStream gZIPInputStream = new java.util.zip.GZIPInputStream(inputStream);
            java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(outputStream);
            int iInstrumentAll = instrumentAll(gZIPInputStream, gZIPOutputStream, str);
            gZIPOutputStream.finish();
            return iInstrumentAll;
        } catch (java.io.IOException e) {
            throw instrumentError(str, e);
        }
    }

    private int instrumentPack200(java.io.InputStream inputStream, java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        try {
            java.io.InputStream inputStreamUnpack = org.jacoco.core.internal.Pack200Streams.unpack(inputStream);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            int iInstrumentAll = instrumentAll(inputStreamUnpack, byteArrayOutputStream, str);
            org.jacoco.core.internal.Pack200Streams.pack(byteArrayOutputStream.toByteArray(), outputStream);
            return iInstrumentAll;
        } catch (java.io.IOException e) {
            throw instrumentError(str, e);
        }
    }

    private void copy(java.io.InputStream inputStream, java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i = read(inputStream, bArr, str);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    private int read(java.io.InputStream inputStream, byte[] bArr, java.lang.String str) throws java.io.IOException {
        try {
            return inputStream.read(bArr);
        } catch (java.io.IOException e) {
            throw instrumentError(str, e);
        }
    }
}
