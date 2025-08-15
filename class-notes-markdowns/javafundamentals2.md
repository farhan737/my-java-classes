# JAVA INTRODUCTION - 2 

## the JVM architecture and how its works internally
JVM is responsible for executing the java programs.
`.class` file ⟶ **JVM**
1. **classloader sub-system**   
    1. loading  
        1. bootstrap classloader.
        2. extension classloader.
        3. application classloader.
    2. linking  
        1. verify
        2. prepare
        3. resolve
    3. initialization  
2. **memory management**  
    1. method area
    2. heap area
    3. stack area    
    4. PC register
    5. native method stack area
3. **execution engine**
    1. interpreter
    2. **JIT**(Just In Time) compiler
    3. garbage collector
4. **JNI (Java Native Interfaces)**
5. **native method libraries**

![JVMArchitecture](JVMarchitecture.svg)  