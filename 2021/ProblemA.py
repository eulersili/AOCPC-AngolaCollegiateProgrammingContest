word = "chi"
user_letter = input("Enter a letter: ").lower().strip()
if len(user_letter) == 1 and user_letter.isalpha():
    if user_letter in word:
        print("Yes")
    else:
        print("No")
elif len(user_letter) == user_letter.isalnum():
    print("Enter a letter and not a number!")
else:
    print("Please, insert a single letter.")
