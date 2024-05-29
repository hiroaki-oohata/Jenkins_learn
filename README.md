# Jenkins���w�ڂ��I

## ����

### ���O����
���炩���� [setup#jenkins](https://github.com/hiroaki-oohata/setup#jenkins) �ɏ]����WSL2��Jenkins���C���X�g�[�����Ă���K�v������B�i�A�J�E���g�쐬���K�v�j

### Jenkins�N��
WSL2�ŃR�}���h�����s  
```bash
sudo service jenkins start
```

### Jenkins�A�N�Z�X
Windows�̃u���E�U����ȉ��փA�N�Z�X  
http://localhost:8080/  
�쐬�����A�J�E���g�Ń��O�C��  

## Job���쐬���Ă݂悤

### �m�[�h�iPC�j�̊m�F
�܂��̓r���h�����s�����m�[�h�iPC�j�����邩�m�F����B
�u�r���h���s��ԁv�������Ɠo�^����Ă���m�[�h�iPC�j���\�������B
WSL2��Jenkins���N�������m�[�h�iPC�j���\������Ă��邱�Ƃ��m�F����B
![build_node](Images/build_node.png)

## �V�K�W���u�쐬
�u�V�K�W���u�쐬�v����W���u���쐬���Ă݂�B
```
�W���u���FSample-pipeline
��ށF�p�C�v���C��
```

```
General
�����FJenkins�w�K�p�W���u - �p�C�v���C��
�r���h�̃p�����[�^�[��
 - �e�L�X�g
�@ ���O�FARG
�@ �f�t�H���g�l�Fhoge
                hoge
�@ �����FJenkins�w�K�p�W���u - �p�C�v���C��
�p�C�v���C��
�@job/Jenkins_learn.groovy��\��t����
```
## ���s
�u�p�����[�^�[�t���r���h�v�Ńf�t�H���g�̂܂܎��s�B  
�I�[���O���[���ɂȂ邱�Ƃ����ҁB  
![build_result](Images/build_result.png)


## �������킹
�ȉ��̃��O���o�͂���Ă����OK
```
Started by user hiroaki-oohata
[Pipeline] Start of Pipeline
[Pipeline] node
Running on Jenkins in /var/lib/jenkins/workspace/Sample-pipeline
[Pipeline] {
[Pipeline] stage
[Pipeline] { (clone)
[Pipeline] echo
�N���[�����J�n���܂�
[Pipeline] script
[Pipeline] {
[Pipeline] sh
+ pwd
/var/lib/jenkins/workspace/Sample-pipeline
[Pipeline] sh
+ ls -l
total 4
drwxr-xr-x 5 jenkins jenkins 4096 May 28 23:42 SampleProj
[Pipeline] sh
+ [ ! -e Jenkins_learn ]
+ git clone https://github.com/hiroaki-oohata/Jenkins_learn.git
Cloning into 'Jenkins_learn'...
[Pipeline] }
[Pipeline] // script
[Pipeline] echo
�N���[��������I�����܂���
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (test)
[Pipeline] sh
+ python3 Jenkins_learn/code/hello.py
Hello World
[Pipeline] echo
�e�X�g������I�����܂���
[Pipeline] }
[Pipeline] // stage
[Pipeline] }
[Pipeline] // node
[Pipeline] End of Pipeline
Finished: SUCCESS
```