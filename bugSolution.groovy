```groovy
def myMethod(List<String> list) {
  list.each { item ->
    if (item == null) {
      println "Null item found!"
    } else {
      println item
    }
  }
}

myMethod(["apple", null, "banana"])
```