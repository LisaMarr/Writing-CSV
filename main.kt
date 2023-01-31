import csv
data = [['Name', 'Age'],
        ['John Doe', 30],
        ['Jane Doe', 25]]

with open('file.csv', 'w', newline='') as file:
    writer = csv.writer(file)
    writer.writerows(data)
