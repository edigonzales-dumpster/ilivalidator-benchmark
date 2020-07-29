# ilivalidator-benchmark

## iox-ili
```
gradle clean build install -x test 
```

## ilivalidator
```
gradle clean build shadowJar -x test
native-image --no-server --verbose --report-unsupported-elements-at-runtime --native-image-info -cp build/libs/ilivalidator-1.11.7-SNAPSHOT-all.jar -H:+ReportExceptionStackTraces
```


## benchmark
```
time java -jar build/libs/ilivalidator-1.11.7-SNAPSHOT-all.jar ../254600.ITF 1> 254600_java.log
time java -jar build/libs/ilivalidator-1.11.7-SNAPSHOT-all.jar  --skipPolygonBuilding ../254600.ITF 1> 254600_java_skipPolygonBuilding.log

time ./ilivalidator --skipPolygonBuilding ../254600.ITF 1> 254600_native_skipPolygonBuilding.log





time java -jar build/libs/ilivalidator-1.11.7-SNAPSHOT-all.jar  ../254900.itf 1> 254900_java.csv
time ./ilivalidator ../254900.itf 1> 254900_native.csv


time java -jar build/libs/ilivalidator-1.11.7-SNAPSHOT-all.jar  ../254600.itf 1> 254600_java.csv
time ./ilivalidator ../254600.itf 1> 254600_native.csv


```

