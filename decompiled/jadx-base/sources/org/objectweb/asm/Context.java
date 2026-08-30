package org.objectweb.asm;

/* JADX INFO: loaded from: classes6.dex */
final class Context {
    org.objectweb.asm.Attribute[] attributePrototypes;
    char[] charBuffer;
    int currentFrameLocalCount;
    int currentFrameLocalCountDelta;
    java.lang.Object[] currentFrameLocalTypes;
    int currentFrameOffset;
    int currentFrameStackCount;
    java.lang.Object[] currentFrameStackTypes;
    int currentFrameType;
    org.objectweb.asm.Label[] currentLocalVariableAnnotationRangeEnds;
    int[] currentLocalVariableAnnotationRangeIndices;
    org.objectweb.asm.Label[] currentLocalVariableAnnotationRangeStarts;
    int currentMethodAccessFlags;
    java.lang.String currentMethodDescriptor;
    org.objectweb.asm.Label[] currentMethodLabels;
    java.lang.String currentMethodName;
    int currentTypeAnnotationTarget;
    org.objectweb.asm.TypePath currentTypeAnnotationTargetPath;
    int parsingOptions;

    Context() {
    }
}
