def get_sum_of_even_nums_1(max):
  result = 0
  for i in range(0, max+1, 2):
    result += i
  return result

first_case_result = get_sum_of_even_nums_1(30)
print(first_case_result)