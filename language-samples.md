# languages samples

Given is a list of the numbers from 1 to 4, calculate the power of 2 for every number and then sum up the results.

## Java Virtual Machine

The JVM has a huge amout of libraries and products.

Products: Apache Tomcat, Jetty, JBoss

### Java

    IntStream.rangeClosed(1, 4).map(n -> n * n).reduce(Integer::sum).getAsInt()

### Kotlin

Kotlin is the preferred programming language for the Android platform.

Products: IntelliJ IDEA, Trello 

    (1..4).map({n -> n * n}).sum()

### Groovy

Groovy was originally designed as the standard script language for java.
You can create Domain-specific language very easy with groovy.

Products: Gradle, Grails, Spock

    (1..4).collect { it * it }.sum()

### Scala

Products: Apache Spark, Apache Kafka, Akka

    (1 to 4).map { n  => n * n  }.sum

### Clojure

    (reduce + (map #(* % %) (range 1 5)))

## Erlang OTP

Code can compiled and replaced in a running system remotely without restarting the server. 
The languages ar erlang and elixir.

Products: RabbitMQ, Couchbase Server, Riak

### Elixir

    1..4 |> Enum.map(fn n -> n * n end) |> Enum.sum()

## Ruby

Products: Ruby on Rails, Puppet

    (1..4).map { |n| n * n }.sum()

## Python

Products: ansible, yum, ubuntu software center, Django, Google App Engine, Mercurial, OpenStack

    sum([ n * n for n in range(1, 5) ])

## Common Lisp

Products: Emacs

In common list you have to extend the language with your own range command:

    (defun range (max &key (min 0) (step 1))
      (loop for n from min below max by step
        collect n))

Now we can use it:

    (reduce #'+ (map 'list (lambda (x) (* x x)) (range 5 :min 1)))
