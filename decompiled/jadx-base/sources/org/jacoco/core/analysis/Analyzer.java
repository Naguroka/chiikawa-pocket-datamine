package org.jacoco.core.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class Analyzer {
    private final org.jacoco.core.analysis.ICoverageVisitor coverageVisitor;
    private final org.jacoco.core.data.ExecutionDataStore executionData;
    private final org.jacoco.core.internal.analysis.StringPool stringPool = new org.jacoco.core.internal.analysis.StringPool();

    public Analyzer(org.jacoco.core.data.ExecutionDataStore executionDataStore, org.jacoco.core.analysis.ICoverageVisitor iCoverageVisitor) {
        this.executionData = executionDataStore;
        this.coverageVisitor = iCoverageVisitor;
    }

    private org.objectweb.asm.ClassVisitor createAnalyzingVisitor(long j, java.lang.String str) {
        boolean[] probes;
        boolean zContains;
        org.jacoco.core.data.ExecutionData executionData = this.executionData.get(j);
        if (executionData == null) {
            zContains = this.executionData.contains(str);
            probes = null;
        } else {
            probes = executionData.getProbes();
            zContains = false;
        }
        final org.jacoco.core.internal.analysis.ClassCoverageImpl classCoverageImpl = new org.jacoco.core.internal.analysis.ClassCoverageImpl(str, j, zContains);
        return new org.jacoco.core.internal.flow.ClassProbesAdapter(new org.jacoco.core.internal.analysis.ClassAnalyzer(classCoverageImpl, probes, this.stringPool) { // from class: org.jacoco.core.analysis.Analyzer.1
            @Override // org.objectweb.asm.ClassVisitor
            public void visitEnd() {
                super.visitEnd();
                org.jacoco.core.analysis.Analyzer.this.coverageVisitor.visitCoverage(classCoverageImpl);
            }
        }, false);
    }

    private void analyzeClass(byte[] bArr) {
        long jClassId = org.jacoco.core.internal.data.CRC64.classId(bArr);
        org.objectweb.asm.ClassReader classReaderClassReaderFor = org.jacoco.core.internal.instr.InstrSupport.classReaderFor(bArr);
        if ((classReaderClassReaderFor.getAccess() & 32768) == 0 && (classReaderClassReaderFor.getAccess() & 4096) == 0) {
            classReaderClassReaderFor.accept(createAnalyzingVisitor(jClassId, classReaderClassReaderFor.getClassName()), 0);
        }
    }

    public void analyzeClass(byte[] bArr, java.lang.String str) throws java.io.IOException {
        try {
            analyzeClass(bArr);
        } catch (java.lang.RuntimeException e) {
            throw analyzerError(str, e);
        }
    }

    public void analyzeClass(java.io.InputStream inputStream, java.lang.String str) throws java.io.IOException {
        try {
            analyzeClass(org.jacoco.core.internal.InputStreams.readFully(inputStream), str);
        } catch (java.io.IOException e) {
            throw analyzerError(str, e);
        }
    }

    private java.io.IOException analyzerError(java.lang.String str, java.lang.Exception exc) {
        java.io.IOException iOException = new java.io.IOException(java.lang.String.format("Error while analyzing %s with JaCoCo %s/%s.", str, org.jacoco.core.JaCoCo.VERSION, org.jacoco.core.JaCoCo.COMMITID_SHORT));
        iOException.initCause(exc);
        return iOException;
    }

    public int analyzeAll(java.io.InputStream inputStream, java.lang.String str) throws java.io.IOException {
        try {
            org.jacoco.core.internal.ContentTypeDetector contentTypeDetector = new org.jacoco.core.internal.ContentTypeDetector(inputStream);
            int type = contentTypeDetector.getType();
            if (type == -889275714) {
                analyzeClass(contentTypeDetector.getInputStream(), str);
                return 1;
            }
            if (type == -889270259) {
                return analyzePack200(contentTypeDetector.getInputStream(), str);
            }
            if (type == 529203200) {
                return analyzeGzip(contentTypeDetector.getInputStream(), str);
            }
            if (type != 1347093252) {
                return 0;
            }
            return analyzeZip(contentTypeDetector.getInputStream(), str);
        } catch (java.io.IOException e) {
            throw analyzerError(str, e);
        }
    }

    public int analyzeAll(java.io.File file) throws java.io.IOException {
        if (file.isDirectory()) {
            int iAnalyzeAll = 0;
            for (java.io.File file2 : file.listFiles()) {
                iAnalyzeAll += analyzeAll(file2);
            }
            return iAnalyzeAll;
        }
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            return analyzeAll(fileInputStream, file.getPath()) + 0;
        } finally {
            fileInputStream.close();
        }
    }

    public int analyzeAll(java.lang.String str, java.io.File file) throws java.io.IOException {
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, java.io.File.pathSeparator);
        int iAnalyzeAll = 0;
        while (stringTokenizer.hasMoreTokens()) {
            iAnalyzeAll += analyzeAll(new java.io.File(file, stringTokenizer.nextToken()));
        }
        return iAnalyzeAll;
    }

    private int analyzeZip(java.io.InputStream inputStream, java.lang.String str) throws java.io.IOException {
        java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(inputStream);
        int iAnalyzeAll = 0;
        while (true) {
            java.util.zip.ZipEntry zipEntryNextEntry = nextEntry(zipInputStream, str);
            if (zipEntryNextEntry == null) {
                return iAnalyzeAll;
            }
            iAnalyzeAll += analyzeAll(zipInputStream, str + "@" + zipEntryNextEntry.getName());
        }
    }

    private java.util.zip.ZipEntry nextEntry(java.util.zip.ZipInputStream zipInputStream, java.lang.String str) throws java.io.IOException {
        try {
            return zipInputStream.getNextEntry();
        } catch (java.io.IOException e) {
            throw analyzerError(str, e);
        }
    }

    private int analyzeGzip(java.io.InputStream inputStream, java.lang.String str) throws java.io.IOException {
        try {
            return analyzeAll(new java.util.zip.GZIPInputStream(inputStream), str);
        } catch (java.io.IOException e) {
            throw analyzerError(str, e);
        }
    }

    private int analyzePack200(java.io.InputStream inputStream, java.lang.String str) throws java.io.IOException {
        try {
            return analyzeAll(org.jacoco.core.internal.Pack200Streams.unpack(inputStream), str);
        } catch (java.io.IOException e) {
            throw analyzerError(str, e);
        }
    }
}
