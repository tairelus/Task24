# Task24
��������� ��� � Java ���������, ���������������� � ��������� ������.
������ ��� ���� ������������ ������:  interrupt, sleep, join
��� ������ ��� �������� ������?
��� ������ ��� �� �����?
����� � ������ ��������� InterruptedException ?

�������� ����� ������� ����� ������������ � ������� (������ ������� ��� MessageLoop)
������ � ������ MessageLoop ������ �� ���� ����� (������ ������� ��� messagesArray).
�������� � ������ MessageLoop ����� run
����� run ������ �������� � ������� �������� ������� messagesArray �� ������ � ���������� 4 �������.

������ ������������� ��������� ������� ����� �������� �� ���� �������:
������ ����� ��� �������� ����� (main thread) - ������ ��������� ������ �����.
������ ����� - ������ ������������ ����� MessageLoop
����� ������� ������� ������  ������ ����� ������ �������� �����������: ������ MessageLoop thread�
����� ������ ������� ������ ������ ����� ������ �������� �����������:���� ���� ������ ����� �������� ���� ����������
���� ������ ����� ��� �������� ����� ������ �������� � ������� ����������� ������ �������: "� ���..."
����� ���������� ������� ������ ������ ����� ������ �������
�����������:������!�
������ ������ ��������� ������ ���� � �������:
��� ������: �����������

������ ������ ���������:

main: ����� MessageLoop thread

main: ��� ���� MessageLoop thread �������� ���� ����������
main: � ���...
main: � ���...
main: � ���...
main: � ���...
main: � ���...
Thread-0: ������ ������ �� �������,
main: � ���...
main: � ���...
main: � ���...
Thread-0: ������ ������ �� �������,
main: � ���...
main: � ���...
main: � ���...
main: � ���...
main: � ���...
Thread-0: ������ ������ �� �������,

main: �����!