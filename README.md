# dev-ecosystems

## Java Virtual Machine

### Java

    List.of(1, 2, 3, 4).stream().map(n -> n * 2).reduce(Integer::sum).get()

### Kotlin

    listOf(1, 2, 3, 4).map({n -> n * 2}).sum()

### Clojure

    (reduce + (map #(* % 2) [1 2 3 4]))

## Erlang OTP

### Elixir

    [1, 2, 3, 4] |> Enum.map(fn n -> n * 2 end) |> Enum.sum()

## Common Lisp

    (reduce #'+ (map 'list (lambda (x) (* x 2)) '(1 2 3 4)))