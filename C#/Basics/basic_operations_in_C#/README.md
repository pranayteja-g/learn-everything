# Basic Operations and Increment/Decrement in C#

## Basic Operations

### Variables
we declare two integer variables, `a` and `b`, and assign values to them. `a` is assigned the value `7`, and `b` is assigned `5`.

### Arithmetic Operations
1. **Addition**: We calculate the sum of `a` and `b` using the `+` operator, which results in `sum = 7 + 5`, so `sum` becomes `12`.

2. **Subtraction**: We calculate the difference between `a` and `b` using the `-` operator, which results in `dif = 7 - 5`, so `dif` becomes `2`.

3. **Multiplication**: We calculate the product of `a` and `b` using the `*` operator, which results in `product = 7 * 5`, so `product` becomes `35`.

4. **Division**: To perform floating-point division, we cast `a` and `b` to `float` before dividing. `quotient` becomes `(float)a / (float)b`, resulting in `quotient = 7.0 / 5.0`, so `quotient` becomes `1.4`.

5. **Modulus**: We calculate the remainder of the division of `a` by `b` using the `%` operator, which results in `remainder = 7 % 5`, so `remainder` becomes `2`.

### Operator Precedence
We explore operator precedence in the code:
- `value1` is calculated as `3 + 4 * 5`, which evaluates to `3 + 20`, making `value1` equal to `23`.
- `value2` is calculated as `(3 + 4) * 5`, which evaluates to `7 * 5`, making `value2` equal to `35`.

## Increment and Decrement

### Increment
- We declare an integer variable `value` and initialize it to `0`.
- We demonstrate various ways to increment `value`:
  - `value = value + 5` and `value += 5` both increase `value` by `5`.
  - `value++` and `++value` both increment `value` by `1`. The difference lies in the order of evaluation in an expression.

### Decrement
- We declare an integer variable `number` and initialize it to `1`.
- We demonstrate various ways to decrement `number`:
  - `number = number - 1`, `number -= 1`, and `number--` all decrease `number` by `1`.


