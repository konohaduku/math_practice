def fib1(num)  # → 《 1 》
  # 初期値を渡す
  return fib2(0, 1, num)  # → 《 2 》
end

def fib2(a, b, c)  # → 《 3 》
  # 再帰終了条件
  if c < 1  # → 《 5 》
    return a
  else
    # fib2メソッドの再帰呼び出しでは、1 番目の引数に現在のフィボナッチ数を、 2 番目の引数に 1 つ前のフィボナッチ数を渡している
    return fib2(a + b, a, c - 1)  # → 《 4 》
  end
end

puts fib1(50)
# => 12586269025