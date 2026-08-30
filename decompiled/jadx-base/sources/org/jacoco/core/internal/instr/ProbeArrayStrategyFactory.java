package org.jacoco.core.internal.instr;

/* JADX INFO: loaded from: classes6.dex */
public final class ProbeArrayStrategyFactory {
    private ProbeArrayStrategyFactory() {
    }

    public static org.jacoco.core.internal.instr.IProbeArrayStrategy createFor(long j, org.objectweb.asm.ClassReader classReader, org.jacoco.core.runtime.IExecutionDataAccessorGenerator iExecutionDataAccessorGenerator) {
        java.lang.String className = classReader.getClassName();
        int majorVersion = org.jacoco.core.internal.instr.InstrSupport.getMajorVersion(classReader);
        if (!isInterfaceOrModule(classReader)) {
            if (majorVersion >= 55) {
                return new org.jacoco.core.internal.instr.CondyProbeArrayStrategy(className, false, j, iExecutionDataAccessorGenerator);
            }
            return new org.jacoco.core.internal.instr.ClassFieldProbeArrayStrategy(className, j, org.jacoco.core.internal.instr.InstrSupport.needsFrames(majorVersion), iExecutionDataAccessorGenerator);
        }
        org.jacoco.core.internal.instr.ProbeCounter probeCounter = getProbeCounter(classReader);
        if (probeCounter.getCount() == 0) {
            return new org.jacoco.core.internal.instr.NoneProbeArrayStrategy();
        }
        if (majorVersion >= 55 && probeCounter.hasMethods()) {
            return new org.jacoco.core.internal.instr.CondyProbeArrayStrategy(className, true, j, iExecutionDataAccessorGenerator);
        }
        if (majorVersion >= 52 && probeCounter.hasMethods()) {
            return new org.jacoco.core.internal.instr.InterfaceFieldProbeArrayStrategy(className, j, probeCounter.getCount(), iExecutionDataAccessorGenerator);
        }
        return new org.jacoco.core.internal.instr.LocalProbeArrayStrategy(className, j, probeCounter.getCount(), iExecutionDataAccessorGenerator);
    }

    private static boolean isInterfaceOrModule(org.objectweb.asm.ClassReader classReader) {
        return (classReader.getAccess() & 33280) != 0;
    }

    private static org.jacoco.core.internal.instr.ProbeCounter getProbeCounter(org.objectweb.asm.ClassReader classReader) {
        org.jacoco.core.internal.instr.ProbeCounter probeCounter = new org.jacoco.core.internal.instr.ProbeCounter();
        classReader.accept(new org.jacoco.core.internal.flow.ClassProbesAdapter(probeCounter, false), 0);
        return probeCounter;
    }
}
