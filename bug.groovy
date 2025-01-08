```groovy
def myMethod(Map params) {
  params.each { key, value ->
    println "$key: $value"
  }
}

myMethod( [a:1, b:2, c:3] )
myMethod( [d:4, e:5] )
```