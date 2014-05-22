(custom-set-variables
 ;; custom-set-variables was added by Custom.
 ;; If you edit it by hand, you could mess it up, so be careful.
 ;; Your init file should contain only one such instance.
 ;; If there is more than one, they won't work right.
 '(custom-safe-themes (quote ("fb4bf07618eab33c89d72ddc238d3c30918a501cf7f086f2edf8f4edba9bd59f" "4c9ba94db23a0a3dea88ee80f41d9478c151b07cb6640b33bfc38be7c2415cc4" default)))
 '(inhibit-startup-screen t)
 '(org-agenda-files (quote ("c:/Users/nickf/Documents/CCC Documents/homepage.org"))))
(custom-set-faces
 ;; custom-set-faces was added by Custom.
 ;; If you edit it by hand, you could mess it up, so be careful.
 ;; Your init file should contain only one such instance.
 ;; If there is more than one, they won't work right.
 )


;; Default font size is 16px
(set-face-attribute 'default nil :height 160)

;; IDO mode on by default
(require 'ido)
(ido-mode t)

;; Marmalade package repo
(require 'package)
(add-to-list 'package-archives
  '("marmalade" . "http://marmalade-repo.org/packages/"))
(package-initialize)

;; Spellcheck
(add-to-list 'exec-path "C:/Program Files (x86)/Aspell/bin")
(setq ispell-program-name "aspell")
(setq ispell-personal-dictionary "C:/Program Files (x86)/Aspell/dict/american.alias")

(require 'ispell)
(global-set-key (kbd "<f8>") 'ispell-word)
(global-set-key (kbd "C-<f8>") 'flyspell-mode)

;; Tabs!!
(setq tab-stop-list (number-sequence 4 200 4))
(setq tab-width 4)
(add-hook 'php-mode-hook '(lambda () (setq indent-tabs-mode t) (setq tab-width 4) (setq c-basic-offset 4)))

;; Set my theme
(load-theme 'nzenburn)

;; main-line, a modern powerline.el
;(require 'main-line)
;(setq main-line-separator-style 'arrow14)

;; when I keep hitting page down, send the cursor to the end of the buffer
(setq scroll-error-top-bottom t)

;; ediff should start in vertical split
(custom-set-variables
 '(ediff-window-setup-function 'ediff-setup-windows-plain)
 '(ediff-diff-options "-w")
 '(ediff-split-window-function 'split-window-horizontally))

;; make all tab presses go through `indent-to`
(setq-default indent-tabs-mode nil)

;; ***********************************************
;; Multi-cursors
;; 2014-05-12
;;
;; Make emacs work like Sublime Text
;;
(require 'multiple-cursors)
(global-set-key (kbd "C-d") 'mc/mark-next-like-this)   ; select something, press C-d to add selection
(global-set-key (kbd "C-l") 'mc/edit-lines)   ; select several lines, use C-l to put cursor on every line
;;
;; ***********************************************


;; ***********************************************
;; Org stuff
;; ---------

;; week starts on monday
(setq org-agenda-start-on-weekday 1)

;; Keybindngs
(global-set-key (kbd "<f12>") 'org-agenda)
(global-set-key (kbd "<f10>") 'org-clock-in)
(global-set-key (kbd "<f11>") 'org-clock-out)
(global-set-key "\C-cl" 'org-store-link)
(global-set-key "\C-cc" 'org-capture)
(global-set-key "\C-ca" 'org-agenda)
(global-set-key "\C-cb" 'org-iswitchb)
(global-set-key (kbd "C-c j") 'org-move-subtree-up)
(global-set-key (kbd "C-c k") 'org-move-subtree-up)

;; Save clock history across Emacs sessions
(setq org-clock-persist 'history)
(org-clock-persistence-insinuate)

;; Turn off HTML Export preable/postable
(setq org-html-preable nil)
(setq org-html-postable t)

;; SQL hilight in org mode ??
(add-hook 'sql-mode-hook
	  (lambda ()
	    (sql-highlight-mysql-keywords)))

;; ***********************************************

