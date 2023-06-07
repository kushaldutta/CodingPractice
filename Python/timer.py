import time
import winsound

frequency, duration = 2500, 2000
def countdown(length):
    while length:
        mins, secs = divmod(length, 60)
        timer = "{:02d}:{:02d}".format(mins, secs)
        print("\r", timer, end="")
        time.sleep(1)
        length -= 1

    print("\r0:00\nCompleted!")
    winsound.Beep(frequency, duration)

t = input("Enter the time in seconds: ")

countdown(int(t))