# languages samples

Given is a list of the numbers from 1 to 4, calculate the power of 2 for every number and then sum up the results.

## Java Virtual Machine

### Java

    IntStream.rangeClosed(1, 4).map(n -> n * n).reduce(Integer::sum).getAsInt()

### Kotlin

    (1..4).map({n -> n * n}).sum()

### Groovy

    (1..4).collect { it * it }.sum()

### Clojure

    (reduce + (map #(* % %) (range 1 5)))

## Erlang OTP

### Elixir

    1..4 |> Enum.map(fn n -> n * n end) |> Enum.sum()

## Ruby

    (1..4).map { |n| n * n }.sum()

## Python

    sum([ n * n for n in range(1, 5) ])

## Common Lisp

In common list you have to extend the language with your own range command:

    (defun range (max &key (min 0) (step 1))
      (loop for n from min below max by step
        collect n))

Now we can use it:

    (reduce #'+ (map 'list (lambda (x) (* x x)) (range 5 :min 1)))
