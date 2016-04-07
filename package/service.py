import time

print 'service.py loaded'

def service():
	while True:
		print 'time is:', str(time.time())
		time.sleep(1)

if __name__ == '__main__':
	print 'starting service'
	service()

