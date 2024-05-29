// 定義したパラメータを取得
def arg = ARG

pipeline {
    // ビルドの実行環境。登録されていれば別のマシンで動くagentにジョブを実行させる場合もある
    agent any

    // 処理を「ステージ」として段階的に定義する。ビルド結果はステージごとに視覚化される
    stages {

        // ステージ: clone として定義
        stage('clone') {
            // ステージごとに実施する処理をsteps内に定義。stepsは1つだけ
            steps {
                print 'クローンを開始します'
                // \var\lib\jenkins\workspace\xxxxxxx にクローンされます
                // すでにプロジェクトがある場合は git pull が実行されます
                sh """
                    pwd
                    ls -l
                    if [ ! -e Jenkins_learn ]; then git clone https://github.com/hiroaki-oohata/Jenkins_learn.git; else git -C ./Jenkins_learn pull; fi
                """
                print 'クローンが正常終了しました'
            }
        }

        // ステージ: test として定義        
        stage('test') {
            // ステージごとに実施する処理をsteps内に定義。stepsは1つだけ
            steps {
                sh "python3 Jenkins_learn/code/hello.py"
                print 'テストが正常終了しました'
            }
        }
    }
}
