def rearrange(elements):
    # Write your code here
    return sorted(elements, key=lambda x:(str(bin(x)).count('1'),x))