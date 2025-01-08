```groovy
def myMethod(Map params) {
  params.eachWithIndex { key, value, index ->
    println "$key: $value at index $index"
  }
}

myMethod( [a:1, b:2, c:3] )
myMethod( [d:4, e:5] )
```