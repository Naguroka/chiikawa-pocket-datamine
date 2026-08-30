import subprocess, struct, sys

ADB = r"C:\LDPlayer\LDPlayer9\adb.exe"
PID = "4685"
MAGIC = struct.pack('<I', 0xFAB11BAF)

regions = []
for line in open(r"C:\Users\AMans\Desktop\coding\ChiPokDecompiled\dumps\maps.txt"):
    parts = line.split()
    if len(parts) < 6:
        continue
    start, end = [int(x, 16) for x in parts[0].split('-')]
    size = end - start
    perm = parts[1]
    if 'r' not in perm:
        continue
    if size >= 6 * 1024 * 1024:  # >= 6MB, any backing
        regions.append((start, size, parts[-1]))

regions.sort(key=lambda x: x[1])
print(f"scanning {len(regions)} regions", flush=True)
for start, size, name in regions:
    skip = start // 4096
    count = (size + 4095) // 4096
    cmd = [ADB, "-s", "127.0.0.1:5555", "exec-out",
           f"dd if=/proc/{PID}/mem bs=4096 skip={skip} count={count} 2>/dev/null"]
    try:
        data = subprocess.run(cmd, capture_output=True, timeout=120).stdout
    except Exception as e:
        print(f"{start:x} {size//1048576}MB {name}: READ FAIL {e}", flush=True)
        continue
    if len(data) < 1024:
        print(f"{start:x} {size//1048576}MB {name}: empty", flush=True)
        continue
    idx = data.find(MAGIC)
    acs = data.count(b'Assembly-CSharp')
    ue = data.count(b'UnityEngine')
    print(f"{start:x} {size//1048576}MB {name}: read={len(data)//1024}KB magic={idx} asmcs={acs} unity={ue}", flush=True)
    if idx >= 0 or acs > 5:
        out = rf"C:\Users\AMans\Desktop\coding\ChiPokDecompiled\dumps\hit_{start:x}.bin"
        open(out, 'wb').write(data)
        print(f"  SAVED -> {out}", flush=True)
