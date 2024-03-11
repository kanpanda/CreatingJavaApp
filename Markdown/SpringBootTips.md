# Markdownチートシート
https://qiita.com/Qiita/items/c686397e4a0f4f11683d

# gitの操作

https://qiita.com/wann/items/688bc17460a457104d7d

「git pull」はローカルにある「master」ブランチに情報をとりこむ

「git fetch」はローカルにある「origin/master」ブランチに情報を取り込む

![alt text](image.png)


git fetch…リモートの「master」ブランチ → ローカルの「origin/master」ブランチ

git merge…ローカルの「origin/master」ブランチ → ローカルの「master」ブランチ

git pullは、上のgit fetch、git mergeを同時に行うコマンド

git pull…リモートの「master」ブランチ →（ローカルの「origin/master」ブランチ→） ローカルの「master」ブランチ

## 戻す方法

<!-- これは `インラインコード`です。 -->
 `git fetch` でのエラー

`git reset --hard HEAD`
 

 # リモート名
 `git remote`でリモート名の確認
 `git remote -v` でリモート名のURLを確認
 デフォルトリモート名は「origin」

